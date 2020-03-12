package com.casadeshow.gerenciadordeeventos.service.exceptions;

public class CasaNaoEncontradaException extends RuntimeException {
	
	private static final long serialVersionUID = 1L ;

	public CasaNaoEncontradaException(String mensagem) {
		super(mensagem);
	}
	
	public CasaNaoEncontradaException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}