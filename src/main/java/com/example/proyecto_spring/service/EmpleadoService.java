package com.example.proyecto_spring.service;

import com.example.proyecto_spring.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;
}
