package com.casadeshow.gerenciadordeeventos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.casadeshow.gerenciadordeeventos.domain.Evento;
import com.casadeshow.gerenciadordeeventos.repository.Eventos;
import com.casadeshow.gerenciadordeeventos.service.exceptions.EventoNaoEncontradoException;

@Service
public class EventoService {
	
	@Autowired
	private Eventos eventos;
	
	public List<Evento> listar() {
	return eventos.findAll();
	}
	
	public List<Evento> listarCapacidadeASC() {
	return eventos.findAll(Sort.by(Sort.Direction.ASC, "capacidade"));
	}
	
	public List<Evento> listarCapacidadeDESC() {
	return eventos.findAll(Sort.by(Sort.Direction.DESC, "capacidade"));
	}
	
	public List<Evento> listarDataASC() {
		return eventos.findAll(Sort.by(Sort.Direction.ASC, "data"));
	}
	
	public List<Evento> listarDataDESC() {
		return eventos.findAll(Sort.by(Sort.Direction.DESC, "data"));
	}
	
	public List<Evento> listarNomeASC() {
		return eventos.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public List<Evento> listarNomeDESC() {
		return eventos.findAll(Sort.by(Sort.Direction.DESC, "nome"));
	}
	
	public List<Evento> listarPrecoASC() {
		return eventos.findAll(Sort.by(Sort.Direction.ASC, "precoIngresso"));
	}
	
	public List<Evento> listarPrecoDESC() {
		return eventos.findAll(Sort.by(Sort.Direction.DESC, "precoIngresso"));
	}
	
	public Optional<Evento> buscar(Long id) {
	Optional<Evento> evento = eventos.findById(id);
	
	if(!evento.isPresent()) {
		throw new EventoNaoEncontradoException("Não foi possível encontrar o evento.");
	}

	return evento;
	}
	
	public Evento salvar(Evento evento) {
		try {
			eventos.save(evento);
		} catch (DataIntegrityViolationException e) {
			throw new IllegalArgumentException("Formato de data inválida");
		}

		return eventos.save(evento);
	}
	
	public void excluir(Long id) {
		try {
			eventos.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new EventoNaoEncontradoException("Não foi possível encontrar o evento.");
		}
	}
	
	public void atualizar(Evento evento) {
		verExiste(evento);
		eventos.save(evento);
	}
	
	private void verExiste(Evento evento) {
		buscar(evento.getIdEvento());
	}
}

