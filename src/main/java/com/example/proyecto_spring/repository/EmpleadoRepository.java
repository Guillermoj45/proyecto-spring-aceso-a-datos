package com.example.proyecto_spring.repository;

import com.example.proyecto_spring.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
