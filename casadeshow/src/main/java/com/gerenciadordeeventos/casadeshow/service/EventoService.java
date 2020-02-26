package com.gerenciadordeeventos.casadeshow.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.gerenciadordeeventos.casadeshow.repository.EventosRepository;
import com.gerenciadordeeventos.model.Evento;

public class EventoService {

	@Autowired
	EventosRepository repository;
	
	
	public List<Evento> findAll() {
		return repository.findAll();
	}
	
	public Evento acharPorId(Long id) throws RecordNotFoundException {
		Optional<Evento> evento = repository.findById(id);
		
		if(evento.isPresent()) {
			return evento.get();
		} else {
			throw new RecordNotFoundException("Show inexistente!");
		}
	}
	
	public Evento criarAtualizarShow(Evento entity) {
		if(entity.getId()  == null) {
			entity = repository.save(entity);
			
			return entity;
		} 
		else {
			Optional<Evento> evento = repository.findById(entity.getId());
			
			if(evento.isPresent()) {
				Evento newEntity = evento.get();
				newEntity.setShows(entity.getEventos());
				newEntity.setLocal(entity.getLocal());
				newEntity.setData(entity.getData());
				newEntity.setValor(entity.getValor());
				newEntity.setIngRestante(entity.getIngRestante());
				newEntity.setCasa(entity.getCasa());
				newEntity.setEstilo(entity.getEstilo());

				newEntity = repository.save(newEntity);
				
				return newEntity;
			} else {
				entity = repository.save(entity);
				
				return entity;
			}
		}
	}
	
	public void apagarEvento(Long id) throws RecordNotFoundException {
		Optional<Evento> evento = repository.findById(id);
		
		if(evento.isPresent()) 
		{
			repository.deleteById(id);
		} else {
			throw new RecordNotFoundException("Não encontrado!");
		}
	}
	
	
	
}

