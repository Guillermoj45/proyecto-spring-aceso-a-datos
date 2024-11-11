package com.example.proyecto_spring.service;

import com.example.proyecto_spring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

}
