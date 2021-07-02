package com.hangaroa.pruebadiazjorge.controller.contract;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.hangaroa.pruebadiazjorge.entity.Departamento;

public interface DepartamentoController {
	
	@GetMapping(value = {"/", ""}, produces = "application/json")
	ResponseEntity<List<Departamento>> findAll (); 
}
