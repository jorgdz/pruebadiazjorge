package com.hangaroa.pruebadiazjorge.exception.custom;

public class ConflictException extends RuntimeException {

	private static final long serialVersionUID = 6366834812732498285L;
	
	public ConflictException(String message) {
		super(message);
	}
}
