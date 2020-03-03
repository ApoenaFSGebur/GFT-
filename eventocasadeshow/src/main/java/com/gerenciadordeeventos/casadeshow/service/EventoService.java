package com.gerenciadordeeventos.casadeshow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.gerenciadordeeventos.casadeshow.model.Evento;
import com.gerenciadordeeventos.casadeshow.repository.EventoRepository;

@Service
public class EventoService {
	
	@Autowired
	private EventoRepository eventosrepository;
//	
	public void salvar(Evento evento) {
		try {
			eventosrepository.save(evento);
		} catch (DataIntegrityViolationException e) {
			throw new IllegalArgumentException("Formato de data inválida");
		}
	}
	
	public void excluir(Long id) {
		eventosrepository.deleteById(id);
	}

}
