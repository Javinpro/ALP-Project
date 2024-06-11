package com.example.springboottest.demo.controller;

import com.example.springboottest.demo.entity.Transportation;
import com.example.springboottest.demo.repository.TransportRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/transportation")
public class TransportController {

    private final TransportRepository transportRepository;

    public TransportController(TransportRepository transportRepository) {
        this.transportRepository = transportRepository;
    }

    @GetMapping
    public List<Transportation> getAllTransportations() {
        return transportRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Transportation> getTransportationById(@PathVariable Integer id) {
        return transportRepository.findById(id);
    }

    @PostMapping
    public Transportation createTransportation(@RequestBody Transportation transportation) {
        return transportRepository.save(transportation);
    }

    @PutMapping("/{id}")
    public Transportation updateTransportation(@PathVariable Integer id, @RequestBody Transportation transportationDetails) {
        Transportation transportation = transportRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transportation not found with id: " + id));

        transportation.setName(transportationDetails.getName());
        transportation.setTglKapal(transportationDetails.getTglKapal());

        return transportRepository.save(transportation);
    }

    @DeleteMapping("/{id}")
    public void deleteTransportation(@PathVariable Integer id) {
        transportRepository.deleteById(id);
    }
}
