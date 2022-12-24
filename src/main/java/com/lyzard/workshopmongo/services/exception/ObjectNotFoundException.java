package com.lyzard.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String menssagem) {
		super(menssagem);
	}
	
}
