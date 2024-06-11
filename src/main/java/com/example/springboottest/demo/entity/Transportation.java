package com.example.springboottest.demo.entity;

import jakarta.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "transportation")
public class Transportation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTransport;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Time tglKapal;

    // Constructors, getters, and setters

    public Transportation() {
    }

    public Transportation(Integer idTransport, String name, Time tglKapal) {
        this.idTransport = idTransport;
        this.name = name;
        this.tglKapal = tglKapal;
    }

    public Integer getIdTransport() {
        return idTransport;
    }

    public void setIdTransport(Integer idTransport) {
        this.idTransport = idTransport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getTglKapal() {
        return tglKapal;
    }

    public void setTglKapal(Time tglKapal) {
        this.tglKapal = tglKapal;
    }
}
