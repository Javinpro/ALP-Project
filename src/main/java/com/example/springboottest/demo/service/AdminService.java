package com.example.springboottest.demo.service;

import com.example.springboottest.demo.entity.Admin;
import com.example.springboottest.demo.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {


@Autowired
private AdminRepository adminRepository;

public Optional<Admin> findAdminById(Integer id) {
    return adminRepository.findById(id);
}

public Admin saveAdmin(Admin admin) {
    return adminRepository.save(admin);
}

public void deleteAdmin(Integer id) {
    adminRepository.deleteById(id);
}

public List<Admin> findAllAdmins() {
    return adminRepository.findAll();
}
}