package com.example.springboottest.demo.entity;

import jakarta.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "points")
public class Points {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPoint;

    @Column(nullable = false)
    private Integer idUser;

    @Column(nullable = false)
    private Integer points;

    @Column(nullable = false)
    private String reason;

    @Column(nullable = false)
    private Time createdAt;

    // Constructors, getters, and setters

    public Points() {
    }

    public Points(Integer idPoint, Integer idUser, Integer points, String reason, Time createdAt) {
        this.idPoint = idPoint;
        this.idUser = idUser;
        this.points = points;
        this.reason = reason;
        this.createdAt = createdAt;
    }

    public Integer getIdPoint() {
        return idPoint;
    }

    public void setIdPoint(Integer idPoint) {
        this.idPoint = idPoint;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Time getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Time createdAt) {
        this.createdAt = createdAt;
    }
}
