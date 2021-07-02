package com.hangaroa.pruebadiazjorge.controller.contract;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.hangaroa.pruebadiazjorge.entity.Empleado;

public interface EmpleadoController {

	/**
	 * 
	 * @param empleado
	 * @return a new depa
	 */
	@PostMapping(value = {"/", ""}, produces = "application/json")
	ResponseEntity<?> save (@Valid @RequestBody Empleado empleado);
	
	/**
	 * 
	 * @param cedula
	 * @param nombre
	 * @param codigoDepa
	 * @return all departaments
	 */
	@GetMapping(value = {"/", ""}, produces = "application/json")
	ResponseEntity<List<Empleado>> findAll (@RequestParam(required = false) String cedula, @RequestParam(required = false) String nombre, @RequestParam Long codigoDepa); 
	
}
