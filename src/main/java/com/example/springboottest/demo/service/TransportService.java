package com.example.springboottest.demo.service;

import com.example.springboottest.demo.entity.Transportation;
import com.example.springboottest.demo.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransportService {

    @Autowired
    private TransportRepository transportationRepository;

    public Optional<Transportation> findTransportationById(Integer id) {
        return transportationRepository.findById(id);
    }

    public Transportation saveTransportation(Transportation transportation) {
        return transportationRepository.save(transportation);
    }

    public void deleteTransportation(Integer id) {
        transportationRepository.deleteById(id);
    }

    public List<Transportation> findAllTransportations() {
        return transportationRepository.findAll();
    }
}
