package com.example.proyecto_spring.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(schema = "proyecto_spring")
public class Encargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_encargo")
    private Long idEncargo;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    private List<Cliente> clientes;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_menu")
    private List<Menu> menus;

    @Column(name = "fecha_solicitud")
    private Date fechaSolicitud;

    @Column(name = "fecha_catering")
    private Date fechaCatering;

}
