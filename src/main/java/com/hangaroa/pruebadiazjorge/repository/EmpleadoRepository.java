package com.hangaroa.pruebadiazjorge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hangaroa.pruebadiazjorge.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
