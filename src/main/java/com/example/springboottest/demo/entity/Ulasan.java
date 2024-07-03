package com.example.springboottest.demo.entity;

import jakarta.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "ulasan")
public class Ulasan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUlasan;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @Column(nullable = false)
    private String teksUlasan;

    @Column
    private Integer rating;

    @Column(nullable = false)
    private Time createdAt;

    // Constructors, getters, and setters

    public Ulasan() {
    }

    public Ulasan(Integer idUlasan, User user, String teksUlasan, Integer rating, Time createdAt) {
        this.idUlasan = idUlasan;
        this.user = user;
        this.teksUlasan = teksUlasan;
        this.rating = rating;
        this.createdAt = createdAt;
    }

    public Integer getIdUlasan() {
        return idUlasan;
    }

    public void setIdUlasan(Integer idUlasan) {
        this.idUlasan = idUlasan;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTeksUlasan() {
        return teksUlasan;
    }

    public void setTeksUlasan(String teksUlasan) {
        this.teksUlasan = teksUlasan;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Time getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Time createdAt) {
        this.createdAt = createdAt;
    }
}
