package com.lucasrc.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found Id " + id);//chamando o construtor da classe pai
	}
	
}
