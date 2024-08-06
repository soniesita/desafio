package com.desafio_backend.service;

import org.springframework.data.domain.Page;
import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;



import com.desafio_backend.entity.Afiliado;

public interface AfiliadoService {
	
	//public Page<Afiliado> findAll(Pageable pageable);
	public List<Afiliado> findAllDb();	
	public Optional<Afiliado> findById(Long id);
	public Afiliado save(Afiliado afiliado);
	public void delteById(Long id);


}
