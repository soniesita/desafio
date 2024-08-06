package com.desafio_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio_backend.entity.UbicacionDto;

public interface UbicacionRepository extends JpaRepository<UbicacionDto, Long> {

}
