package com.bsav157.petagram;

public class Pet {
    private String name;
    private int likes;
    private int image;

    public Pet(String name, int likes, int image) {
        this.name = name;
        this.likes = likes;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
