package io.swagger.service;

import io.swagger.model.Album;
import io.swagger.model.AlbumListResponse;
import io.swagger.model.AlbumStats;
import io.swagger.model.ArtistStats;
import io.swagger.model.Comment;
import io.swagger.model.CommentListResponse;
import io.swagger.model.MerchItem;
import io.swagger.model.MerchItemListResponse;
import io.swagger.model.MerchStats;
import io.swagger.model.SongListResponse;
import io.swagger.model.SongResponse;
import io.swagger.repository.OrderRepository;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StatService {

  private final OrderRepository orderRepository;

  private final RestTemplate restTemplate;
  private final String contentServiceBaseUrl;

  public StatService(
    OrderRepository orderRepository,
    RestTemplate restTemplate,
    @Value("${service.contenido.url}") String contentServiceBaseUrl
  ) {
    this.orderRepository = orderRepository;
    this.contentServiceBaseUrl = contentServiceBaseUrl;
    this.restTemplate = restTemplate;
  }

  public AlbumStats getAlbumStats(String albumId) {
    AlbumStats stats = new AlbumStats();
    Integer sales = orderRepository.countAlbumSales(albumId);
    Integer plays = 0; // TODO: coger de servicio de contenido
    BigDecimal rate = BigDecimal.ZERO;

    // Obtención del rating de un disco
    List<Comment> comments = getAlbumComments(albumId);
    if (comments != null && !comments.isEmpty()) {
      BigDecimal totalRate = BigDecimal.ZERO;
      for (Comment comment : comments) {
        totalRate = totalRate.add(BigDecimal.valueOf(comment.getRating()));
      }
      rate = totalRate.divide(
        BigDecimal.valueOf(comments.size()),
        2,
        BigDecimal.ROUND_HALF_UP
      );
    }

    // Obtención de reproducciones desde servicio de contenido
    System.out.println("Getting plays for album " + albumId);
    SongListResponse songs = getSongsOfAlbum(albumId);
    if (songs != null && songs.getData() != null) {
      for (SongResponse song : songs.getData()) {
        System.out.println("Getting plays for song " + song.getId());
        if (song.getStats() != null && song.getStats().getPlayCount() != null) {
          plays += song.getStats().getPlayCount();
        } else {
          System.out.println("No stats found for song " + song.getId());
        }
      }
    }

    stats.setAlbumSales(sales);
    stats.setAlbumPlays(plays);
    stats.setAlbumRate(rate);
    return stats;
  }

  public MerchStats getMerchStats(String merchId) {
    MerchStats stats = new MerchStats();
    Integer sales = orderRepository.countMerchSales(merchId);
    BigDecimal rate = BigDecimal.ZERO;

    List<Comment> comments = getMerchComments(merchId);
    if (comments != null && !comments.isEmpty()) {
      BigDecimal totalRate = BigDecimal.ZERO;
      for (Comment comment : comments) {
        totalRate = totalRate.add(BigDecimal.valueOf(comment.getRating()));
      }
      rate = totalRate.divide(
        BigDecimal.valueOf(comments.size()),
        2,
        BigDecimal.ROUND_HALF_UP
      );
    }

    stats.setMerchSales(sales);
    stats.setMerchRate(rate);
    return stats;
  }

  public ArtistStats getArtistStats(String artistId) {
    Integer totalAlbumSales = 0;
    Integer totalMerchSales = 0;

    List<Album> artistAlbums = getAlbumsOfUser(artistId);
    for (Album album : artistAlbums) {
      Integer albumSales = orderRepository.countAlbumSales(album.getId());
      totalAlbumSales += albumSales;
    }

    List<MerchItem> artistMerch = getMerchOfUser(artistId);
    for (MerchItem merch : artistMerch) {
      Integer merchSales = orderRepository.countMerchSales(merch.getId());
      totalMerchSales += merchSales;
    }

    ArtistStats stats = new ArtistStats();
    stats.setTotalSales(totalAlbumSales + totalMerchSales);

    int plays = 0;
    for (Album album : artistAlbums) {
      AlbumStats albumStats = getAlbumStats(album.getId());
      plays += albumStats.getAlbumPlays();
    }

    stats.setTotalPlays(plays);

    return stats;
  }

  private List<Comment> getAlbumComments(String albumId) {
    String url = contentServiceBaseUrl + "/albums/" + albumId + "/comments";
    CommentListResponse commentResponse = restTemplate.getForObject(
      url,
      CommentListResponse.class
    );
    return Arrays.asList(commentResponse.getData());
  }

  private List<Comment> getMerchComments(String merchId) {
    String url = contentServiceBaseUrl + "/merch/" + merchId + "/comments";
    CommentListResponse commentResponse = restTemplate.getForObject(
      url,
      CommentListResponse.class
    );
    return Arrays.asList(commentResponse.getData());
  }

  private List<Album> getAlbumsOfUser(String userId) {
    String url = contentServiceBaseUrl + "/albums?artistId=" + userId;
    AlbumListResponse albumListResponse = restTemplate.getForObject(
      url,
      AlbumListResponse.class
    );
    return albumListResponse.getData();
  }

  private List<MerchItem> getMerchOfUser(String userId) {
    String url = contentServiceBaseUrl + "/merch?artistId=" + userId;
    MerchItemListResponse merchListResponse = restTemplate.getForObject(
      url,
      MerchItemListResponse.class
    );
    return Arrays.asList(merchListResponse.getData());
  }

  private SongListResponse getSongsOfAlbum(String albumId) {
    String url = contentServiceBaseUrl + "/tracks?albumId=" + albumId;
    SongListResponse songListResponse = restTemplate.getForObject(
      url,
      SongListResponse.class
    );
    return songListResponse;
  }
}
