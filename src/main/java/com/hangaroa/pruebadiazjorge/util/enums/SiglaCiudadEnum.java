package com.hangaroa.pruebadiazjorge.util.enums;

public enum SiglaCiudadEnum {
	
	/**
	 * {@enum GYE}.
	 * 
	 */
	GYE("GYE"), 
	
	
	/**
	 * {@enum UIO}.
	 * 
	 */
	UIO("UIO"),
	
	/**
	 * {@enum MAN}.
	 * 
	 */
	MAN("MAN");
	
	private final String value;
	
	private SiglaCiudadEnum(String value) {
		this.value = value;
	}
	
	/**
	 * Return the string value of this enum token.
	 */
	public String value() {
		return this.value;
	}
}
