package com.example.newproject.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;


public class News {
    public News(Long id, String name, String smallName, String photos, String description, LocalDateTime date) {
        this.id = id;
        this.name = name;
        this.smallName = smallName;
        this.photos = photos;
        this.description = description;
        this.date = date;
    }

    private Long id;


    private String name;

    private String smallName;

    private String photos;


    private String description;

    private LocalDateTime date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSmallName() {
        return smallName;
    }

    public void setSmallName(String smallName) {
        this.smallName = smallName;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }


}
