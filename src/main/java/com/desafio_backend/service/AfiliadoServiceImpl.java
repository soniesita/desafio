package com.desafio_backend.service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.desafio_backend.entity.Afiliado;
import com.desafio_backend.repository.AfiliadoRepository;

@Service
public class AfiliadoServiceImpl implements AfiliadoService {

	@Autowired
	private AfiliadoRepository afiliadoRepository;
	
	@Override
	public List<Afiliado> findAllDb() {
		// TODO Auto-generated method stub
		return afiliadoRepository.findAllDb();
	}

	/*@Override
	public Page<Afiliado> findAll(Pageable pageable){
		return afiliadoRepository.findAll();
	}*/
	
	@Override
	public Optional<Afiliado> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Afiliado save(Afiliado afiliado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	




}
