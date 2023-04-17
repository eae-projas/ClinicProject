package com.eeep.clinic.controllers;

import com.eeep.clinic.domain.models.Admin;
import com.eeep.clinic.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/admin/")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public List<Admin> getAdmins() {
        return adminService.getAdmins();
    }

    @GetMapping("{id}")
    public Optional<Admin> getAdminPorId(@PathVariable Long id) {
        return adminService.getAdminPorId(id);
    }

    @PostMapping
    public Admin saveAdmin(@RequestBody Admin udmin) {
        return adminService.saveAdmin(udmin);
    }

    @PutMapping
    public Admin update(@RequestBody Admin admin) {
        return adminService.updateAdmin(admin);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        adminService.deleteAdmin(id);
    }
}
