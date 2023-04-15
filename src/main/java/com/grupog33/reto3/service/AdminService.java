package com.grupog33.reto3.service;

import com.grupog33.reto3.model.AdminModel;
import com.grupog33.reto3.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public List<AdminModel> obtener() {
        return adminRepository.findAll();
    }

    public void guardar(AdminModel admin) {
        adminRepository.save(admin);
    }
}
