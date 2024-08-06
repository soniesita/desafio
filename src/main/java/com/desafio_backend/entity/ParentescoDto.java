package com.desafio_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "parentesco", schema = "desafio")
public class ParentescoDto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String parentesco;
}
