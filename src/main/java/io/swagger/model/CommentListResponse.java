package io.swagger.model;

public class CommentListResponse {
    private Comment[] data;
    private Meta meta;

    public Comment[] getData() {
        return data;
    }

    public void setData(Comment[] data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
