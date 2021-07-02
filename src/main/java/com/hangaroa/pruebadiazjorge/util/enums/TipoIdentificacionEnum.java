package com.hangaroa.pruebadiazjorge.util.enums;

public enum TipoIdentificacionEnum {
	
	/**
	 * {@enum ced}.
	 * 
	 */
	ced("ced"), 
	
	
	/**
	 * {@enum ruc}.
	 * 
	 */
	ruc("ruc"),
	
	/**
	 * {@enum pas}.
	 * 
	 */
	pas("pas");
	
	private final String value;
	
	private TipoIdentificacionEnum(String value) {
		this.value = value;
	}
	
	/**
	 * Return the string value of this enum token.
	 */
	public String value() {
		return this.value;
	}
}
