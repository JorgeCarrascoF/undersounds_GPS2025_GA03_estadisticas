package io.swagger.model;

import java.util.List;

public class AlbumListResponse {
    private List<Album> data;
    private Meta meta;

    public List<Album> getData() {
        return data;
    }

    public Meta getMeta() {
        return meta;
    }
}
