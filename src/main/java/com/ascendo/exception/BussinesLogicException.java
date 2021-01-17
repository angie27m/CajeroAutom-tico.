package com.ascendo.exception;

/*
 * Clase que lanza una excepci�n y permite tener control cuando un error l�gico se presente
 */
public class BussinesLogicException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	
	public BussinesLogicException(String message) {
		super(message);

	}
	
}