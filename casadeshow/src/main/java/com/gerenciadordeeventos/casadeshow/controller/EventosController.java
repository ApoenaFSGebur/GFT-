package com.gerenciadordeeventos.casadeshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gerenciadordeeventos.casadeshow.repository.EventosRepository;
import com.gerenciadordeeventos.model.Evento;

@Controller
public class EventosController {

	@Autowired
	private EventosRepository eventosrepository;
	
	@RequestMapping("/Gerenciador")
	public String getGerenciadorDeEventos() {
		return "GerenciadorDeEventos";
	}
	
	@RequestMapping("/")
	public String getPaginaInicial() {
		return "PaginaInicial";
	}
	
	@RequestMapping("/CasadeShow")
	public String getCadastroCasaDeShow() {
		return "CadastroCasaDeShow";		
	}

	@RequestMapping("/evento")
	public String getCadastroEventos() {
		return "CadastroEventos";
	}
		
	@RequestMapping(method = RequestMethod.POST)
	public String salvar (Evento evento ) {
		
		eventosrepository.save(evento);
		return "Evento";
	}
	
}
		
