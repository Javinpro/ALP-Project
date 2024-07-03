package com.example.springboottest.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "gallery")
public class Gallery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idImage;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;
    
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

    public Gallery(Integer idImage, User user, byte[] image, String description, Boolean isApproved) {
        this.idImage = idImage;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
