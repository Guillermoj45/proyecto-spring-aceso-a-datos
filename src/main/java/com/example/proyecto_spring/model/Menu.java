package com.example.proyecto_spring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "proyecto_spring")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_menu")
    private Long idMenu;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private double precio;

    @Column(name = "descripcion")
    private String descripcion;

}
