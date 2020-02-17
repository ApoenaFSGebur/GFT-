package com.gerenciadordeeventos.casadeshow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EventosController {
	
	@RequestMapping("/home/novo")
	public String novo() {
		return "CadastroTitulo";
	}
	
}