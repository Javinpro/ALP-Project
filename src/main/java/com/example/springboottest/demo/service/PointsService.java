package com.example.springboottest.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboottest.demo.entity.Points;
import com.example.springboottest.demo.repository.PointsRepository;

@Service
public class PointsService {

    @Autowired
    private PointsRepository pointsRepository;

    public Optional<Points> findPointsById(Integer id) {
        return pointsRepository.findById(id);
    }

    public Points savePoints(Points points) {
        return pointsRepository.save(points);
    }

    public void deletePoints(Integer id) {
        pointsRepository.deleteById(id);
    }

    public List<Points> findAllPoints() {
        return pointsRepository.findAll();
    }

    public List<Points> findPointsByUserId(Integer idUser) {
        return pointsRepository.findByIdUser(idUser);
    }
}
