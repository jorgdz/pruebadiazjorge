package com.hangaroa.pruebadiazjorge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hangaroa.pruebadiazjorge.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
	
	List<Empleado> findByDepartamento_CodigoDepartamentoAndNumeroIdentificacionOrPrimerNombre(Long codigoDepa, String cedula, String nombre);
	
	Empleado findByNumeroIdentificacion (String numIdentificacion);
}
