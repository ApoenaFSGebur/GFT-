package com.casadeshow.gerenciadordeeventos.service.exceptions;

public class CasaExistenteException extends RuntimeException {

	private static final long serialVersionUID =  1L;

	public CasaExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public CasaExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}