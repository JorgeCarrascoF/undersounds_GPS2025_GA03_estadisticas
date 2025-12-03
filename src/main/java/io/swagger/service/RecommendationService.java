package io.swagger.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.ArrayList;

import io.swagger.model.OrderItem;
import io.swagger.model.Order;
import io.swagger.model.Album;
import io.swagger.model.AlbumListResponse;
import io.swagger.model.AlbumResponse;

@Service
public class RecommendationService {

    private final OrderService orderService;
    private final RestTemplate restTemplate;

    private final String contentServiceBaseUrl;

    public RecommendationService(OrderService orderService, RestTemplate restTemplate,
            @Value("${service.contenido.url}") String contentServiceBaseUrl) {
        this.orderService = orderService;
        this.restTemplate = restTemplate;
        this.contentServiceBaseUrl = contentServiceBaseUrl;
    }

    public List<Album> getRecommendationsForUser(String userId) {
        List<Order> userOrders = orderService.getOrdersByUser(userId);

        List<String> albumIds = userOrders.stream().flatMap(order -> order.getItems().stream())
                .filter(item -> item.getType().equals("album"))
                .map(OrderItem::getProductId)
                .collect(Collectors.toList());

        List<Album> purchasedAlbums = getAlbumsByIds(albumIds);

        List<String> genres = purchasedAlbums.stream()
                .map(Album::getGenres)
                .distinct()
                .collect(Collectors.toList());

        List<Album> recommendedAlbums = getAlbumsByGenre(genres);

        // Devuelvo sólo los albums que no ha comprado
        return recommendedAlbums.stream()
                .filter(album -> !albumIds.contains(album.getId()))
                .collect(Collectors.toList());
    }

    public List<Album> getAlbumsByIds(List<String> albumIds) {
        return albumIds.parallelStream()
                .map(id -> restTemplate.getForObject(contentServiceBaseUrl + "/albums/" + id, AlbumResponse.class))
                .filter(Objects::nonNull)
                .map(AlbumResponse::getData)
                .collect(Collectors.toList());
    }

    public List<Album> getAlbumsByGenre(List<String> albumGenres) {
        return albumGenres.parallelStream()
                .map(genre -> restTemplate.getForObject(contentServiceBaseUrl + "/albums?genre=" + genre,
                        AlbumListResponse.class))
                .filter(Objects::nonNull)
                .flatMap(response -> response.getData().stream())
                .collect(Collectors.toList());
    }
}
