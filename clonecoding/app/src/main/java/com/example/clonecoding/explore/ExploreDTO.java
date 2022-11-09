package com.example.clonecoding.explore;

public class ExploreDTO {
    int category_img;
    String category_title, viewers, contents_category;

    public ExploreDTO(int category_img, String category_title, String viewers, String contents_category) {
        this.category_img = category_img;
        this.category_title = category_title;
        this.viewers = viewers;
        this.contents_category = contents_category;
    }

    public int getCategory_img() {
        return category_img;
    }

    public void setCategory_img(int category_img) {
        this.category_img = category_img;
    }

    public String getCategory_title() {
        return category_title;
    }

    public void setCategory_title(String category_title) {
        this.category_title = category_title;
    }

    public String getViewers() {
        return viewers;
    }

    public void setViewers(String viewers) {
        this.viewers = viewers;
    }

    public String getContents_category() {
        return contents_category;
    }

    public void setContents_category(String contents_category) {
        this.contents_category = contents_category;
    }
}
