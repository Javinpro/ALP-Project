package com.example.springboottest.demo.service;

import com.example.springboottest.demo.entity.Islands;
import com.example.springboottest.demo.repository.IslandsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IslandsService {

    @Autowired
    private IslandsRepository islandsRepository;

    public Optional<Islands> findIslandsById(Integer id) {
        return islandsRepository.findById(id);
    }

    public Islands saveIslands(Islands islands) {
        return islandsRepository.save(islands);
    }

    public void deleteIslands(Integer id) {
        islandsRepository.deleteById(id);
    }

    public List<Islands> findAllIslands() {
        return islandsRepository.findAll();
    }

    public List<Islands> findIslandsByName(String name) {
        return islandsRepository.findByNameIslands(name);
    }
}
