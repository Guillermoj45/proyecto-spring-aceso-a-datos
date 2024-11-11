package com.example.proyecto_spring.repository;

import com.example.proyecto_spring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
