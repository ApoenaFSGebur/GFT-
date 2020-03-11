package com.casadeshow.gerenciadordeeventos.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.casadeshow.gerenciadordeeventos.domain.DetalhesErro;
import com.casadeshow.gerenciadordeeventos.service.exceptions.CasaExistenteException;
import com.casadeshow.gerenciadordeeventos.service.exceptions.CasaNaoEncontradaException;
import com.casadeshow.gerenciadordeeventos.service.exceptions.EventoExistenteException;
import com.casadeshow.gerenciadordeeventos.service.exceptions.EventoNaoEncontradoException;
import com.casadeshow.gerenciadordeeventos.service.exceptions.UsuarioExistenteException;
import com.casadeshow.gerenciadordeeventos.service.exceptions.UsuarioNaoEncontradoException;
import com.casadeshow.gerenciadordeeventos.service.exceptions.VendaExistenteException;
import com.casadeshow.gerenciadordeeventos.service.exceptions.VendaNaoEncontradaException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(CasaNaoEncontradaException.class)
	public ResponseEntity<DetalhesErros> handleLivroNaoEncontradoException(CasaNaoEncontradaException e,
			HttpServletRequest request) {

		DetalhesErros erro = new DetalhesErros();
		erro.setStatus(404l);
		erro.setTitulo("Não foi possível encontrar a casa.");
		erro.setMensDev("http://erros.gerenciadordeventos.com/404");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}

	@ExceptionHandler(CasaExistenteException.class)
	public ResponseEntity<DetalhesErro> handleCasaExistenteException(CasaExistenteException e,
			HttpServletRequest request) {

		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(409l);
		erro.setTitulo("Casa já existente.");
		erro.setMensDev("http://erros.apieventos.com/409");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
	}

	@ExceptionHandler(EventoNaoEncontradoException.class)
	public ResponseEntity<DetalhesErros> handleAutorNaoEncontradoException(EventoNaoEncontradoException e,
			HttpServletRequest request) {

		DetalhesErros erro = new DetalhesErros();
		erro.setStatus(404l);
		erro.setTitulo("Não foi possível encontrar o evento.");
		erro.setMensDev("http://erros.gerenciadordeventos.com/404");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}

	@ExceptionHandler(EventoExistenteException.class)
	public ResponseEntity<DetalhesErro> handleEventoExistenteException (EventoExistenteException e, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(409l);
		erro.setTitulo("Evento já existente.");
		erro.setMensDev("http://erros.apieventos.com/409");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);

	} 
	
	@ExceptionHandler(UsuarioNaoEncontradoException.class)
	public ResponseEntity<DetalhesErro> handleUsuarioNaoEncontradoException(UsuarioNaoEncontradoException e,
			HttpServletRequest request) {

		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404l);
		erro.setTitulo("Não foi possível encontrar o usuário.");
		erro.setMensDev("http://erros.apieventos.com/404");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}

	@ExceptionHandler(UsuarioExistenteException.class)
	public ResponseEntity<DetalhesErro> handleUsuarioExistenteException(UsuarioExistenteException e,
			HttpServletRequest request) {

		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(409l);
		erro.setTitulo("Usuário já existente.");
		erro.setMensDev("http://erros.apieventos.com/409");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
	}

	@ExceptionHandler(VendaExistenteException.class)
	public ResponseEntity<DetalhesErro> handleVendaExistenteException(VendaExistenteException e,
			HttpServletRequest request) {

		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(409l);
		erro.setTitulo("Venda já existente.");
		erro.setMensDev("http://erros.apieventos.com/409");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
	}

	@ExceptionHandler(VendaNaoEncontradaException.class)
	public ResponseEntity<DetalhesErro> handleVendaNaoEncontradaException(VendaNaoEncontradaException e,
			HttpServletRequest request) {

		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404l);
		erro.setTitulo("Não foi possível encontrar a venda.");
		erro.setMensDev("http://erros.apieventos.com/404");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}

	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<DetalhesErros> handleDataIntegrityViolationException(DataIntegrityViolationException e,
			HttpServletRequest request) {

		DetalhesErros erro = new DetalhesErros();
		erro.setStatus(400l);
		erro.setTitulo("Requisição inválida.");
		erro.setMensDev("http://erros.socialbooks.com/400");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
	}
}
