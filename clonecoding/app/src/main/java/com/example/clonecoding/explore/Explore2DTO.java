package com.example.clonecoding.explore;

public class Explore2DTO {
    private String id, cont, contents;
    private int imgv, broadview;

    public Explore2DTO(String id, String cont, String contents, int imgv, int broadview) {
        this.id = id;
        this.cont = cont;
        this.contents = contents;
        this.imgv = imgv;
        this.broadview = broadview;
    }

    public int getBroadview() {
        return broadview;
    }

    public void setBroadview(int broadview) {
        this.broadview = broadview;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getImgv() {
        return imgv;
    }

    public void setImgv(int imgv) {
        this.imgv = imgv;
    }
}
