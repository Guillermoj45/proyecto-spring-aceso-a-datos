package com.example.proyecto_spring.repository;

import com.example.proyecto_spring.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
