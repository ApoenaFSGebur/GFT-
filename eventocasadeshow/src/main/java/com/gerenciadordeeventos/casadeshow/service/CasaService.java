package com.gerenciadordeeventos.casadeshow.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciadordeeventos.casadeshow.model.Casa;
import com.gerenciadordeeventos.casadeshow.repository.CasaRepository;



public class CasaService {

	@Service
	public class CasaService {
		
		@Autowired
		private CasaRepository casa;
	//	
		public void salvar(Casa casa) {
			casarepository.save(casa);
		}
		
		public void excluir(Long id) {
			casarepository.deleteById(id);
		}
	}
}
