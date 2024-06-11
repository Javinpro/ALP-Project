package com.example.springboottest.demo.repository;

import com.example.springboottest.demo.entity.Points;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PointsRepository extends JpaRepository<Points, Integer> {
    List<Points> findByIdUser(Integer idUser);
}
