package com.example.springboottest.demo.service;

import com.example.springboottest.demo.entity.Ulasan;
import com.example.springboottest.demo.repository.UlasanRepository;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.List;
import java.util.Optional;

@Service
public class UlasanService {

    private final UlasanRepository ulasanRepository;

    public UlasanService(UlasanRepository ulasanRepository) {
        this.ulasanRepository = ulasanRepository;
    }

    public List<Ulasan> getAllUlasan() {
        return ulasanRepository.findAll();
    }

    public Optional<Ulasan> getUlasanById(Integer id) {
        return ulasanRepository.findById(id);
    }

    public Ulasan createUlasan(Integer idUser, String teksUlasan, Integer rating, Time createdAt) {
        Ulasan ulasan = new Ulasan();
        ulasan.setIdUser(idUser);
        ulasan.setTeksUlasan(teksUlasan);
        ulasan.setRating(rating);
        ulasan.setCreatedAt(createdAt);
        return ulasanRepository.save(ulasan);
    }

    public Ulasan updateUlasan(Integer id, Integer idUser, String teksUlasan, Integer rating, Time createdAt) {
        Ulasan ulasan = ulasanRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ulasan not found with id: " + id));

        ulasan.setIdUser(idUser);
        ulasan.setTeksUlasan(teksUlasan);
        ulasan.setRating(rating);
        ulasan.setCreatedAt(createdAt);

        return ulasanRepository.save(ulasan);
    }

    public void deleteUlasan(Integer id) {
        ulasanRepository.deleteById(id);
    }
}
