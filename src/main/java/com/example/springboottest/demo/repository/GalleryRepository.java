package com.example.springboottest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.example.springboottest.demo.entity.Gallery;

@Repository
public interface GalleryRepository extends JpaRepository<Gallery, Integer> {
     List<Gallery> findByIdUser(Integer userId);
}
