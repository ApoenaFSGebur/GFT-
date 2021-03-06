package com.algaworks.socialbooks.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.algaworks.socialbooks.domain.DetalhesErros;
import com.algaworks.socialbooks.services.exceptions.AutorExistenteException;
import com.algaworks.socialbooks.services.exceptions.AutorNaoEncontradoException;
import com.algaworks.socialbooks.services.exceptions.LivroNaoEncontradoException;

@Controller
@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(LivroNaoEncontradoException.class)
	public ResponseEntity<DetalhesErros> handleLivroNaoEncontradoException (LivroNaoEncontradoException e, HttpServletRequest request) {
		
		DetalhesErros erro = new DetalhesErros();
		erro.setStatus(404l);
		erro.setTitulo("Não foi possível encontrar o livro.");
		erro.setMensDev("http://erros.socialbooks.com/404");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
	@ExceptionHandler(AutorExistenteException.class)
	public ResponseEntity<DetalhesErros> handleAutorExistenteException (AutorExistenteException e, HttpServletRequest request) {
		
		DetalhesErros erro = new DetalhesErros();
		erro.setStatus(409l);
		erro.setTitulo("Autor já existente.");
		erro.setMensDev("http://erros.socialbooks.com/409");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
	}
	
	@ExceptionHandler(AutorNaoEncontradoException.class)
	public ResponseEntity<DetalhesErros> handleAutorNaoEncontradoException (AutorNaoEncontradoException e, HttpServletRequest request) {
		
		DetalhesErros erro = new DetalhesErros();
		erro.setStatus(404l);
		erro.setTitulo("Não foi possível encontrar o autor.");
		erro.setMensDev("http://erros.socialbooks.com/404");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}

	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<DetalhesErros> handleDataIntegrityViolationException (DataIntegrityViolationException e, HttpServletRequest request) {
		
		DetalhesErros erro = new DetalhesErros();
		erro.setStatus(400l);
		erro.setTitulo("Requisição inválida.");
		erro.setMensDev("http://erros.socialbooks.com/400");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
	}
}