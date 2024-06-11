package com.example.springboottest.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "gallery")
public class Gallery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idImage;

    @Column(nullable = false)
    private Integer idUser;

    @Lob
    @Column(nullable = false)
    private byte[] image;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Boolean isApproved;

    // Constructors, getters, and setters

    public Gallery() {
    }

    public Gallery(Integer idImage, Integer idUser, byte[] image, String description, Boolean isApproved) {
        this.idImage = idImage;
        this.idUser = idUser;
        this.image = image;
        this.description = description;
        this.isApproved = isApproved;
    }

    public Integer getIdImage() {
        return idImage;
    }

    public void setIdImage(Integer idImage) {
        this.idImage = idImage;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getApproved() {
        return isApproved;
    }

    public void setApproved(Boolean approved) {
        isApproved = approved;
    }
}
