package com.gerenciadordeeventos.casadeshow.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciadordeeventos.casadeshow.repository.CasaRepository;
import com.gerenciadordeeventos.model.Casadeshow;

@Service
public class CasaService {
	
	@Autowired
	 CasaRepository repositorio;
	
	public Casadeshow criarAtualizarCasa(Casadeshow entidade) {
		if(entidade.getId() == null) {
			entidade = repositorio.save(entidade);
			
			return entidade;
		} 
		else {
			Optional<Casadeshow> casa = repositorio.findById(entidade.getId());
			
			if(casa.isPresent()) {
				Casadeshow novaEntidade = casa.get();
				novaEntidade.setNome(entidade.getNome());
				novaEntidade.setEndereco(entidade.getEndereco());

				novaEntidade = repositorio.save(novaEntidade);
				
				return novaEntidade;
			} else {
				entidade = repositorio.save(entidade);
				
				return entidade;
			}
		}
	}
}
