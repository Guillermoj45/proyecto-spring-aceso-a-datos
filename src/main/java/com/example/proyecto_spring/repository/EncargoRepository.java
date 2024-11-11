package com.example.proyecto_spring.repository;

import com.example.proyecto_spring.model.Encargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EncargoRepository extends JpaRepository<Encargo, Long> {
}
