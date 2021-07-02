package com.hangaroa.pruebadiazjorge.service.contract;

import java.util.List;

import com.hangaroa.pruebadiazjorge.entity.Empleado;

/**
 * 
 * @author JORGE
 *
 */
public interface EmpleadoService {
	
	/**
	 * 
	 * @param empleado
	 * @return new employee
	 */
	Empleado save (Empleado empleado);
	
	/**
	 * 
	 * @return list all employees by cedula or nombre and codigoDepartamento
	 */
	List<Empleado> findByCedulaOrNombreAndCodigoDepa (String cedula, String nombre, Long codigoDepa);
}
