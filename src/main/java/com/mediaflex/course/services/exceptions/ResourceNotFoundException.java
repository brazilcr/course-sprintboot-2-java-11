package com.mediaflex.course.services.exceptions;

// subclasse do runtimexception - Exceptions que o compilador não obriga a tratar

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id "+id);
	}
	
	
}
