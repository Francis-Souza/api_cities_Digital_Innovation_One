package com.joinsolutions.api_cities.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object country) {
		super("Resource not found. Object " + country );
	}
}
