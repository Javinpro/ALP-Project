package com.example.springboottest.demo.repository;

import com.example.springboottest.demo.entity.Ulasan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UlasanRepository extends JpaRepository<Ulasan, Integer> {
    // Define custom methods here if needed
}
