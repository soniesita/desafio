package com.desafio_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.desafio_backend.entity.BeneficiarioDto;


public interface BeneficiarioRepository extends JpaRepository<BeneficiarioDto, Long> {

}
