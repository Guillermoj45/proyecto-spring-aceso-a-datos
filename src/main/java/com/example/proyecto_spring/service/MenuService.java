package com.example.proyecto_spring.service;

import com.example.proyecto_spring.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MenuService {
    @Autowired
    private EmpleadoRepository empleadoRepository;
}
