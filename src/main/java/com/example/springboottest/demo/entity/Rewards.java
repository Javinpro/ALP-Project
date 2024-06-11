package com.example.springboottest.demo.entity;

import jakarta.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "rewards")
public class Rewards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReward;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column(nullable = false)
    private Integer pointsRequired;

    @Column
    private Integer stock;

    @Column(nullable = false)
    private Time createdAt;

    // Constructors, getters, and setters

    public Rewards() {
    }

    public Rewards(Integer idReward, String name, String description, Integer pointsRequired, Integer stock, Time createdAt) {
        this.idReward = idReward;
        this.name = name;
        this.description = description;
        this.pointsRequired = pointsRequired;
        this.stock = stock;
        this.createdAt = createdAt;
    }

    public Integer getIdReward() {
        return idReward;
    }

    public void setIdReward(Integer idReward) {
        this.idReward = idReward;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPointsRequired() {
        return pointsRequired;
    }

    public void setPointsRequired(Integer pointsRequired) {
        this.pointsRequired = pointsRequired;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Time getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Time createdAt) {
        this.createdAt = createdAt;
    }
}
