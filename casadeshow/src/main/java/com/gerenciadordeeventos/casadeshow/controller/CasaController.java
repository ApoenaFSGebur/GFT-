package com.gerenciadordeeventos.casadeshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gerenciadordeeventos.casadeshow.service.CasaService;
import com.gerenciadordeeventos.model.Casadeshow;

@Controller
public class CasaController {
	
	@Autowired
	private CasaService casarepository;
	
//	@RequestMapping(method = RequestMethod.POST)
//	public String salvar(Casadeshow casadeshow) {
//		
//		casarepository.save(casadeshow);
//		return "Casadeshow";
//		
//	}
	
	@RequestMapping("/salvar")
	public ModelAndView save(Casadeshow casadeshow) {
		
		 
		ModelAndView mv = new ModelAndView("CadastroCasaDeShow");
		mv.addObject("casadeshow", casarepository.criarAtualizarCasa(casadeshow));
		return mv;
		
	}
}
