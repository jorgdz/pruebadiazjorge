package com.hangaroa.pruebadiazjorge.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hangaroa.pruebadiazjorge.controller.contract.DepartamentoController;
import com.hangaroa.pruebadiazjorge.entity.Departamento;
import com.hangaroa.pruebadiazjorge.repository.DepartamentoRepository;

@RestController
@RequestMapping(value = "/api/departamentos")
public class DepartamentoControllerImpl implements DepartamentoController {

	@Autowired
	private DepartamentoRepository depaRepo;
	
	@Override
	public ResponseEntity<List<Departamento>> findAll() {
		return ResponseEntity.ok(this.depaRepo.findAll());
	}

	@Override
	public ResponseEntity<?> save(Departamento departamento) {
		return ResponseEntity
			.status(HttpStatus.CREATED)
			.body(this.depaRepo.save(departamento));
	}

}
