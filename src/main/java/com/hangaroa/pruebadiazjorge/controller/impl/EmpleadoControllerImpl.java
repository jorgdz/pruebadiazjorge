package com.hangaroa.pruebadiazjorge.controller.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hangaroa.pruebadiazjorge.controller.contract.EmpleadoController;
import com.hangaroa.pruebadiazjorge.entity.Empleado;
import com.hangaroa.pruebadiazjorge.service.contract.EmpleadoService;

@RestController
@RequestMapping(value = "/api/empleados")
public class EmpleadoControllerImpl implements EmpleadoController {

	@Autowired
	private EmpleadoService serviceEmpleado;
	
	@Override
	public ResponseEntity<?> save(@Valid Empleado empleado) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.serviceEmpleado.save(empleado));
	}

	@Override
	public ResponseEntity<List<Empleado>> findAll(String cedula, String nombre, Long codigoDepa) {
		return ResponseEntity
			.ok(this.serviceEmpleado
			.findByCedulaOrNombreAndCodigoDepa(cedula, nombre, codigoDepa));
	}

}
