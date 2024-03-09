package com.example.atividadelistapersonalizada;


public class ItemLista {
    private Integer image;
    private String info;

    public ItemLista() {
    }

    public ItemLista(Integer image, String info) {
        this.image = image;
        this.info = info;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return info;
    }
}
