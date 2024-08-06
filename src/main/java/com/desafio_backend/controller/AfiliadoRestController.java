package com.desafio_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio_backend.service.AfiliadoService;
import com.desafio_backend.service.AfiliadoServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api/v1/afiliados")
public class AfiliadoRestController {
	
	@Autowired
	private AfiliadoService afiliadoService;
	
	@Autowired
	private AfiliadoServiceImpl afiliadoServiceImpl;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok().body(afiliadoServiceImpl.findAllDb());
	}
	
	
	
	
	
}
