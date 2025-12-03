package io.swagger.model;
import java.util.List;

public class SongListResponse{
    private List<SongResponse> data;
    private Meta meta;

    public List<SongResponse> getData() {
        return data;
    }

    public void setData(List<SongResponse> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}