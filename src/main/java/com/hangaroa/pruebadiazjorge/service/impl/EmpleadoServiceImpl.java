package com.hangaroa.pruebadiazjorge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hangaroa.pruebadiazjorge.entity.Empleado;
import com.hangaroa.pruebadiazjorge.exception.custom.ConflictException;
import com.hangaroa.pruebadiazjorge.repository.EmpleadoRepository;
import com.hangaroa.pruebadiazjorge.service.contract.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoRepository empleadoRepo; 
	
	@Override
	public Empleado save(Empleado empleado) {
		Empleado _emp = this.empleadoRepo
			.findByNumeroIdentificacion(empleado.getNumeroIdentificacion());
		
		if (_emp != null)
			throw new ConflictException("El número de identificación " + empleado.getNumeroIdentificacion() + " ya existe.");
		
		return this.empleadoRepo.save(empleado);
	}

	@Override
	public List<Empleado> findByCedulaOrNombreAndCodigoDepa(String cedula, String nombre, Long codigoDepa) {
		return this.empleadoRepo.findByDepartamento_CodigoDepartamentoAndNumeroIdentificacionOrPrimerNombre(codigoDepa, cedula, nombre);
	}

}
