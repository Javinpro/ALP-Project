package com.example.springboottest.demo.controller;

import com.example.springboottest.demo.entity.Admin;
import com.example.springboottest.demo.repository.AdminRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3306")
@RequestMapping("/api/admin")
public class AdminController {

    private AdminRepository adminRepository;

    public AdminController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @GetMapping
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @GetMapping("/{id}")
    public Admin getAdminById(@PathVariable Integer id) {
        Optional<Admin> admin = adminRepository.findById(id);
        if (admin.isPresent()) {
            return admin.get();
        } else {
            throw new RuntimeException("Admin not found for id :: " + id);
        }
    }

    @PostMapping("/")
    public Admin createAdmin(@RequestBody Admin admin) {
        return adminRepository.save(admin);
    }

    @PutMapping("/{id}")
    public Admin updateAdmin(@PathVariable Integer id, @RequestBody Admin adminDetails) {
        Admin admin = adminRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin not found for id :: " + id));

        admin.setUsername(adminDetails.getUsername());
        admin.setEmail(adminDetails.getEmail());
        admin.setPassword(adminDetails.getPassword());

        return adminRepository.save(admin);
    }

    @DeleteMapping("/{id}")
    public void deleteAdmin(@PathVariable Integer id) {
        Admin admin = adminRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin not found for id :: " + id));
        adminRepository.delete(admin);
    }
}