package io.swagger.model;

import java.time.LocalDateTime;

public class MerchItem {
    private String id;
    private String title;
    private String description;
    private Integer price;
    private Boolean active;
    private String currency;
    private Integer stock;
    private String sku;
    private String artistId;
    private String labelId;
    private String coverId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // --- Getters ---
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public Boolean getActive() {
        return active;
    }

    public String getCurrency() {
        return currency;
    }

    public Integer getStock() {
        return stock;
    }

    public String getSku() {
        return sku;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getLabelId() {
        return labelId;
    }

    public String getCoverId() {
        return coverId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    // --- Setters ---
    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public void setCoverId(String coverId) {
        this.coverId = coverId;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
