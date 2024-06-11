package com.example.springboottest.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboottest.demo.entity.Islands;

@Repository
public interface IslandsRepository extends JpaRepository<Islands, Integer> {
    List<Islands> findByNameIslands(String nameIslands);
}
