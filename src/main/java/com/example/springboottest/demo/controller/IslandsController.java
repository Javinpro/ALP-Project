package com.example.springboottest.demo.controller;

import com.example.springboottest.demo.entity.Islands;
import com.example.springboottest.demo.repository.IslandsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/islands")
public class IslandsController {

    private final IslandsRepository islandsRepository;

    public IslandsController(IslandsRepository islandsRepository) {
        this.islandsRepository = islandsRepository;
    }

    @GetMapping
    public List<Islands> getAllIslands() {
        return islandsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Islands> getIslandsById(@PathVariable Integer id) {
        return islandsRepository.findById(id);
    }

    @PostMapping
    public Islands createIslands(@RequestBody Islands islands) {
        return islandsRepository.save(islands);
    }

    @PutMapping("/{id}")
    public Islands updateIslands(@PathVariable Integer id, @RequestBody Islands islandsDetails) {
        Islands islands = islandsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Islands not found with id: " + id));

        islands.setNameIslands(islandsDetails.getNameIslands());
        islands.setDescription(islandsDetails.getDescription());
        islands.setImage(islandsDetails.getImage());
        islands.setLocation(islandsDetails.getLocation());

        return islandsRepository.save(islands);
    }

    @DeleteMapping("/{id}")
    public void deleteIslands(@PathVariable Integer id) {
        islandsRepository.deleteById(id);
    }
}
