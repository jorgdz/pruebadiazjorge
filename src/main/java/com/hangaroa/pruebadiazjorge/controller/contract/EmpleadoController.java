package com.hangaroa.pruebadiazjorge.controller.contract;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.hangaroa.pruebadiazjorge.entity.Empleado;

public interface EmpleadoController {

	@PostMapping(value = {"/", ""}, produces = "application/json")
	ResponseEntity<?> save (@Valid @RequestBody Empleado empleado);
}
