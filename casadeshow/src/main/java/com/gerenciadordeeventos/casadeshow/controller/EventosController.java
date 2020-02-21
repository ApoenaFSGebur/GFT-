package com.gerenciadordeeventos.casadeshow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {

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
		
}
		
