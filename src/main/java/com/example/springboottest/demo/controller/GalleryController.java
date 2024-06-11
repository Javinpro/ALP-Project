package com.example.springboottest.demo.controller;

import com.example.springboottest.demo.entity.Gallery;
import com.example.springboottest.demo.repository.GalleryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/gallery")
public class GalleryController {


    private GalleryRepository galleryRepository;

    public GalleryController(GalleryRepository galleryRepository) {
        this.galleryRepository = galleryRepository;
    }

    @GetMapping
    public List<Gallery> getAllGalleries() {
        return galleryRepository.findAll();
    }

    @GetMapping("/{id}")
    public Gallery getGalleryById(@PathVariable Integer id) {
        Optional<Gallery> gallery = galleryRepository.findById(id);
        if (gallery.isPresent()) {
            return gallery.get();
        } else {
            throw new RuntimeException("Galeri tidak ditemukan dengan ID: " + id);
        }
    }

    @PostMapping("/")
    public Gallery createGallery(@RequestBody Gallery gallery) {
        return galleryRepository.save(gallery);
    }

    @PutMapping("/{id}")
    public Gallery updateImage(@PathVariable Integer id, @RequestBody Gallery galleryDetails) {
        Gallery gallery = galleryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Galeri tidak ditemukan dengan ID: " + id));

        gallery.setIdUser(galleryDetails.getIdUser());
        gallery.setImage(galleryDetails.getImage());
        gallery.setDescription(galleryDetails.getDescription());
        gallery.setApproved(galleryDetails.getApproved());

        return galleryRepository.save(gallery);
    }

    @DeleteMapping("/{id}")
    public void deleteGallery(@PathVariable Integer id) {
        Gallery gallery = galleryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Galeri tidak ditemukan dengan ID:: " + id));
        galleryRepository.delete(gallery);
    }
}