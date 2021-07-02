package com.hangaroa.pruebadiazjorge.controller.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hangaroa.pruebadiazjorge.controller.contract.EmpleadoController;
import com.hangaroa.pruebadiazjorge.entity.Empleado;
import com.hangaroa.pruebadiazjorge.repository.EmpleadoRepository;

@RestController
@RequestMapping(value = "/api/empleados")
public class EmpleadoControllerImpl implements EmpleadoController {

	@Autowired
	private EmpleadoRepository empleadoRepo;
	
	@Override
	public ResponseEntity<?> save(@Valid Empleado empleado) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.empleadoRepo.save(empleado));
	}

}
