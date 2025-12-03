package io.swagger.model;

public class MerchItemListResponse {
    private MerchItem[] data;
    private Meta meta;

    public MerchItem[] getData() {
        return data;
    }

    public void setData(MerchItem[] data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}