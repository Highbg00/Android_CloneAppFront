package com.example.clonecoding.social;

public class SocialDTO {
    private int imgv;
    private String id_id, statement;

    public SocialDTO(int imgv, String id_id, String statement) {
        this.imgv = imgv;
        this.id_id = id_id;
        this.statement = statement;
    }

    public SocialDTO(int imgv) {
        this.imgv = imgv;
    }

    public int getImgv() {
        return imgv;
    }

    public void setImgv(int imgv) {
        this.imgv = imgv;
    }

    public String getId_id() {
        return id_id;
    }

    public void setId_id(String id_id) {
        this.id_id = id_id;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
}
