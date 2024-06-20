package com.example.springboottest.demo.entity;

import jakarta.persistence.*;
import java.sql.Time;

@Entity
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String token;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private boolean revoked;

    @Column(nullable = false)
    private Time expirationDate;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isRevoked() {
        return revoked;
    }

    public void setRevoked(boolean revoked) {
        this.revoked = revoked;
    }

    public Time getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Time expirationDate) {
        this.expirationDate = expirationDate;
    }
}
