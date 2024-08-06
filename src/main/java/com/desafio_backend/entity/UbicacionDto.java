package com.desafio_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ubicaciones", schema = "desafio")
public class UbicacionDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String departamento;
    private String municipio;
    private String direccion;
}