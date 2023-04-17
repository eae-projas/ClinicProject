package com.eeep.clinic.services;

import com.eeep.clinic.domain.models.Admin;
import com.eeep.clinic.repositories.AdminRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Transactional
    public List<Admin> getAdmins() {
        return adminRepository.findAll();
    }

    @Transactional
    public Optional<Admin> getAdminPorId(Long id) {
        return adminRepository.findById(id);
    }

    @Transactional
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Transactional
    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Transactional
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}
