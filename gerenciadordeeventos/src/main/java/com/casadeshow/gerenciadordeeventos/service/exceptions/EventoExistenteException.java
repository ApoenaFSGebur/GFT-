package com.casadeshow.gerenciadordeeventos.service.exceptions;

public class EventoExistenteException extends RuntimeException {
	
	private static final long serialVersionUID = 1L ;

	public EventoExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public EventoExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
