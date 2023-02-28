package com.example.recycler_view;

public class MyItem {
    final private int imageResId;
    final private String title;
    final private String text;

    public MyItem(int imageResId, String title, String text) {
        this.imageResId = imageResId;
        this.title = title;
        this.text = text;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
