package com.example.springboottest.demo.repository;

import com.example.springboottest.demo.entity.Transportation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends JpaRepository<Transportation, Integer> {
    // Define custom methods here if needed
}
