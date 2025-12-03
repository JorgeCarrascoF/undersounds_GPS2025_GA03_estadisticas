package io.swagger.model;


public class Audio {
    private String id;
    private String codec;
    private Integer bitrate;
    private String url;
    private String trackId;

        public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }
}