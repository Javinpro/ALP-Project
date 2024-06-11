package com.example.springboottest.demo.service;

import com.example.springboottest.demo.entity.Gallery;
import com.example.springboottest.demo.repository.GalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GalleryService {

    @Autowired
    private GalleryRepository galleryRepository;

    public Optional<Gallery> findGalleryById(Integer id) {
        return galleryRepository.findById(id);
    }

    public Gallery saveGallery(Gallery gallery) {
        return galleryRepository.save(gallery);
    }

    public void deleteGallery(Integer id) {
        galleryRepository.deleteById(id);
    }

    public List<Gallery> findAllGalleries() {
        return galleryRepository.findAll();
    }

    public List<Gallery> findGalleriesByUserId(Integer userId) {
        return galleryRepository.findByIdUser(userId);
    }
}

