package io.swagger.model;

public class Lyrics {
    private String id;
    private String language;
    private String text;
    private String trackId;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getTrackId() {
        return trackId;
    }
    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }
}