package com.hangaroa.pruebadiazjorge.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hangaroa.pruebadiazjorge.util.enums.SiglaCiudadEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "departamentos")
public class Departamento implements Serializable {

	private static final long serialVersionUID = 301221593452760975L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "IncrementDepartamentos", allocationSize = 1, name = "CUST_SEQ")
    @Column(name = "codigo_departamento")
	private Long codigoDepartamento;
    
	@NotEmpty(message = "El nombre del departamento es obligatorio.")
	@Column(name = "nombre_departamento")
	private String nombreDepartamento; 
	
	@Enumerated(EnumType.STRING)
	@NotNull(message = "La sigla de la ciudad no puede ser nulo.")
	@Column(name = "sigla_ciudad")
	private SiglaCiudadEnum siglaCiudad;

	@OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"departamento"})
	private List<Empleado> empleados;
		
	public Departamento(Long codigoDepartamento,
			@NotEmpty(message = "El nombre del departamento es obligatorio.") String nombreDepartamento,
			@NotNull(message = "La sigla de la ciudad no puede ser nulo.") SiglaCiudadEnum siglaCiudad) {
		super();
		this.codigoDepartamento = codigoDepartamento;
		this.nombreDepartamento = nombreDepartamento;
		this.siglaCiudad = siglaCiudad;
	}
	
	@Override
	public String toString() {
		return "Departamento [codigoDepartamento=" + codigoDepartamento + ", nombreDepartamento=" + nombreDepartamento
				+ ", siglaCiudad=" + siglaCiudad + "]";
	}
}
