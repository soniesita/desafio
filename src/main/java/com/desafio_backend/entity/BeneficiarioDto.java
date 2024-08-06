package com.desafio_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "beneficiarios", schema = "desafio")
public class BeneficiarioDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String relacion;
    private int edad;
}
