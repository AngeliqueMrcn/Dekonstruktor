package com.example.dekonstruktor;

public class AdModel {
    private String title;
    private String address;
    private int image;
    // Constructor
    public AdModel(String title, int address, int image) {
        this.title = title;
        this.address = String.valueOf(address);
        this.image = image;
    }

    // Getter and Setter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


}
