package com.desafio_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.desafio_backend.entity.ComunicacionDto;


public interface ComunicacionRepository extends JpaRepository<ComunicacionDto, Long>{

}
