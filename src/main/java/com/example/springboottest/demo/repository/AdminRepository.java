package com.example.springboottest.demo.repository;

import com.example.springboottest.demo.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    // Define custom methods here if needed
}
