package com.example.springboottest.demo.repository;

import com.example.springboottest.demo.entity.Rewards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardsRepository extends JpaRepository<Rewards, Integer> {
    // Define custom methods here if needed
}
