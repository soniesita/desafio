package com.desafio_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@Table(name = "afiliados", schema = "desafio")
@AllArgsConstructor
@NoArgsConstructor
public class Afiliado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numeroIdentificacion;

    private String nombre;
    private String apellido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ubicacion_id")
    private UbicacionDto ubicacion;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "afiliado_id") 
    private List<BeneficiarioDto> beneficiarios;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "afiliado_contacto",
        joinColumns = @JoinColumn(name = "afiliado_id"),
        inverseJoinColumns = @JoinColumn(name = "contacto_id")
    )
    private List<ComunicacionDto> contactos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "regimen_id")
    private RegimenDto regimen;
}
