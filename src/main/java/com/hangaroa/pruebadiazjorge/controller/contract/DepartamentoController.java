package com.hangaroa.pruebadiazjorge.controller.contract;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hangaroa.pruebadiazjorge.entity.Departamento;

public interface DepartamentoController {
	
	@GetMapping(value = {"/", ""}, produces = "application/json")
	ResponseEntity<List<Departamento>> findAll (); 
	
	@PostMapping(value = {"/", ""}, produces = "application/json")
	ResponseEntity<?> save (@Valid @RequestBody Departamento departamento);
}
