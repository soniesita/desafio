package com.desafio_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio_backend.entity.RegimenDto;

public interface RegimenRepository extends JpaRepository<RegimenDto, Long> {

}
