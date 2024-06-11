package com.example.springboottest.demo.controller;

import com.example.springboottest.demo.entity.Ulasan;
import com.example.springboottest.demo.repository.UlasanRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ulasan")
public class UlasanController {

    private final UlasanRepository ulasanRepository;

    public UlasanController(UlasanRepository ulasanRepository) {
        this.ulasanRepository = ulasanRepository;
    }

    @GetMapping
    public List<Ulasan> getAllUlasan() {
        return ulasanRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Ulasan> getUlasanById(@PathVariable Integer id) {
        return ulasanRepository.findById(id);
    }

    @PostMapping
    public Ulasan createUlasan(@RequestBody Ulasan ulasan) {
        return ulasanRepository.save(ulasan);
    }

    @PutMapping("/{id}")
    public Ulasan updateUlasan(@PathVariable Integer id, @RequestBody Ulasan ulasanDetails) {
        Ulasan ulasan = ulasanRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ulasan not found with id: " + id));

        ulasan.setIdUser(ulasanDetails.getIdUser());
        ulasan.setTeksUlasan(ulasanDetails.getTeksUlasan());
        ulasan.setRating(ulasanDetails.getRating());
        ulasan.setCreatedAt(ulasanDetails.getCreatedAt());

        return ulasanRepository.save(ulasan);
    }

    @DeleteMapping("/{id}")
    public void deleteUlasan(@PathVariable Integer id) {
        ulasanRepository.deleteById(id);
    }
}
