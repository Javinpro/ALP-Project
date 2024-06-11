package com.example.springboottest.demo.repository;

import com.example.springboottest.demo.entity.UserRewards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRewardsRepository extends JpaRepository<UserRewards, Long> {
    // Define custom methods here if needed
}
