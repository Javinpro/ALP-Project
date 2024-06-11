package com.example.springboottest.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "islands")
public class Islands {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idIslands;

    @Column(nullable = false, length = 100)
    private String nameIslands;

    @Column(nullable = false)
    private String description;

    @Lob
    @Column(nullable = false)
    private byte[] image;

    @Column(nullable = false)
    private String location;

    // Constructors, getters, and setters

    public Islands() {
    }

    public Islands(Integer idIslands, String nameIslands, String description, byte[] image, String location) {
        this.idIslands = idIslands;
        this.nameIslands = nameIslands;
        this.description = description;
        this.image = image;
        this.location = location;
    }

    public Integer getIdIslands() {
        return idIslands;
    }

    public void setIdIslands(Integer idIslands) {
        this.idIslands = idIslands;
    }

    public String getNameIslands() {
        return nameIslands;
    }

    public void setNameIslands(String nameIslands) {
        this.nameIslands = nameIslands;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
