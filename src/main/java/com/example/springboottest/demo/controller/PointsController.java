package com.example.springboottest.demo.controller;

import com.example.springboottest.demo.entity.Points;
import com.example.springboottest.demo.repository.PointsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/points")
public class PointsController {

    private final PointsRepository pointsRepository;

    public PointsController(PointsRepository pointsRepository) {
        this.pointsRepository = pointsRepository;
    }

    @GetMapping
    public List<Points> getAllPoints() {
        return pointsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Points> getPointsById(@PathVariable Integer id) {
        return pointsRepository.findById(id);
    }

    @PostMapping
    public Points createPoints(@RequestBody Points points) {
        return pointsRepository.save(points);
    }

    @PutMapping("/{id}")
    public Points updatePoints(@PathVariable Integer id, @RequestBody Points pointsDetails) {
        Points points = pointsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Points not found with id: " + id));

        points.setIdUser(pointsDetails.getIdUser());
        points.setPoints(pointsDetails.getPoints());
        points.setReason(pointsDetails.getReason());
        points.setCreatedAt(pointsDetails.getCreatedAt());

        return pointsRepository.save(points);
    }

    @DeleteMapping("/{id}")
    public void deletePoints(@PathVariable Integer id) {
        pointsRepository.deleteById(id);
    }
}
