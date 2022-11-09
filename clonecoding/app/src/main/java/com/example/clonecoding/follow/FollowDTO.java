package com.example.clonecoding.follow;

public class FollowDTO {
    int broadcast, imgv_profile;
    String broadcast_title, broadcast_contents, contents_theme;

    public FollowDTO(int broadcast, int imgv_profile, String broadcast_title, String broadcast_contents, String contents_theme) {
        this.broadcast = broadcast;
        this.imgv_profile = imgv_profile;
        this.broadcast_title = broadcast_title;
        this.broadcast_contents = broadcast_contents;
        this.contents_theme = contents_theme;
    }

    public int getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(int broadcast) {
        this.broadcast = broadcast;
    }

    public int getImgv_profile() {
        return imgv_profile;
    }

    public void setImgv_profile(int imgv_profile) {
        this.imgv_profile = imgv_profile;
    }

    public String getBroadcast_title() {
        return broadcast_title;
    }

    public void setBroadcast_title(String broadcast_title) {
        this.broadcast_title = broadcast_title;
    }

    public String getBroadcast_contents() {
        return broadcast_contents;
    }

    public void setBroadcast_contents(String broadcast_contents) {
        this.broadcast_contents = broadcast_contents;
    }

    public String getContents_theme() {
        return contents_theme;
    }

    public void setContents_theme(String contents_theme) {
        this.contents_theme = contents_theme;
    }
}
