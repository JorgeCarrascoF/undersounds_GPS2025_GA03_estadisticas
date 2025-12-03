package io.swagger.model;

import java.time.LocalDateTime;
import java.util.List;


public class Album {
    private String id;
    private String title;
    private String description;
    private LocalDateTime releaseDate;
    private String releaseState;
    private String artistId;
    private ArtistRef artist;
    private String labelId;
    private LabelRef label;
    private Double price;
    private String currency;
    private String genres;
    private List<Song> tracks;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String coverImageUrl;

    // Getters y setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getArtistId() { return artistId; }
    public void setArtistId(String artistId) { this.artistId = artistId; }

    public ArtistRef getArtist() { return artist; }
    public void setArtist(ArtistRef artist) { this.artist = artist; }

    public String getLabelId() { return labelId; }
    public void setLabelId(String labelId) { this.labelId = labelId; }

    public LabelRef getLabel() { return label; }
    public void setLabel(LabelRef label) { this.label = label; }

    public LocalDateTime getReleaseDate() { return releaseDate; }
    public void setReleaseDate(LocalDateTime releaseDate) { this.releaseDate = releaseDate; }

    public String getReleaseState() { return releaseState; }
    public void setReleaseState(String releaseState) { this.releaseState = releaseState; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getGenres() { return genres; }
    public void setGenres(String genres) { this.genres = genres; }

    public String getCoverImageUrl() { return coverImageUrl; }
    public void setCoverImageUrl(String coverImageUrl) { this.coverImageUrl = coverImageUrl; }

    public List<Song> getTracks() { return tracks; }
    public void setTracks(List<Song> tracks) { this.tracks = tracks; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
