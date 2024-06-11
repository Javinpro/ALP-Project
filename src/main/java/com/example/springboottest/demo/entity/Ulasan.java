package com.example.springboottest.demo.entity;

import jakarta.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "ulasan")
public class Ulasan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUlasan;

    @Column(nullable = false)
    private Integer idUser;

    @Column(nullable = false)
    private String teksUlasan;

    @Column
    private Integer rating;

    @Column(nullable = false)
    private Time createdAt;

    // Constructors, getters, and setters

    public Ulasan() {
    }

    public Ulasan(Integer idUlasan, Integer idUser, String teksUlasan, Integer rating, Time createdAt) {
        this.idUlasan = idUlasan;
        this.idUser = idUser;
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

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
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
