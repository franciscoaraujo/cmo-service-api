package br.com.assmbl.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;
	

	public UsuarioNotFoundException(String nome) {
		super(String.format("Usuario com " + nome + "  não foi encontrado"));
	}
}
