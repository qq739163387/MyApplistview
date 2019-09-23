package com.example.myapplicationlistview;

public class Book {
    private String title;

    public Book(String title, int coverResourceId) {
        this.setTitle(title);
        this.setCoverResourceId(coverResourceId);
    }

    private int coverResourceId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCoverResourceId() {
        return coverResourceId;
    }

    public void setCoverResourceId(int coverResourceId) {
        this.coverResourceId = coverResourceId;
    }
}
