package com.desafio_backend.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "contactos", schema = "desafio")
public class ComunicacionDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String valor;
}