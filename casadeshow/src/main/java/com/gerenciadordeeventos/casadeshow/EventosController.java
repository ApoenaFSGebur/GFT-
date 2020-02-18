package com.gerenciadordeeventos.casadeshow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {

	@RequestMapping("/evento")
	public String getCadastroEventos() {
		return "CadastroEventos";
	}
		@RequestMapping("/CasadeShow")
		public String getCadastroCasaDeShow() {
			return "CadastroCasaDeShow";		
	}
		@RequestMapping("/")
		public String getPaginaInicial() {
			return "PaginaInicial";
		}

}
