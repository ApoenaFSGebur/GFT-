package com.gerenciadordeeventos.casadeshow.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gerenciadordeeventos.casadeshow.model.Casa;
import com.gerenciadordeeventos.casadeshow.model.Evento;
import com.gerenciadordeeventos.casadeshow.model.Genero;
import com.gerenciadordeeventos.casadeshow.model.OpcaoCasa;
import com.gerenciadordeeventos.casadeshow.repository.CasaRepository;
import com.gerenciadordeeventos.casadeshow.repository.EventoRepository;

@Controller
public class EventoController {


		@Autowired
		private CasaRepository casarepository;

		@Autowired
		private EventoRepository eventorepository;

		@RequestMapping("/Gerenciador")
		public String GerenciadorDeEventos() {
			return "GerenciadorDeEventos";
		}

		@RequestMapping("/")
		public String home() {
			return "PaginaInicial";
		}

		@RequestMapping("/CasadeShow")
    	public String CadastroCasaDeShow() {
		return "CadastroCasaDeShow";
		}

		@RequestMapping("/evento")
		public ModelAndView CadastroEventos() {
			ModelAndView mv = new ModelAndView("CadastroEventos");
//			Evento evento = new Evento();
//			mv.addObject(evento);
			mv.addObject("todosGenero");
//			mv.addObject(new Evento());
			return mv;
		}

		@RequestMapping(value ="/eventosave", method = RequestMethod.POST)
		public String eventosave(@Validated Evento evento, Errors errors, RedirectAttributes attributes) {
			if (errors.hasErrors()) {
			return "CadastroEventos";
			
			}
			
			eventorepository.save(evento);
			attributes.addFlashAttribute("mensagem", "Concluído com sucesso!");
			return "redirect:/eventorepository/evento";
			
		} 
		
		@RequestMapping(value ="/casasave", method= RequestMethod.POST)
		public String casasave(@Validated Casa casa, Errors errors, RedirectAttributes attributes) {
			if (errors.hasErrors()) {
			return "CadastroCasaDeShow";
			
			}
			
			casarepository.save(casa);
			attributes.addFlashAttribute("mensagem", "Concluído com sucesso!");
			return "redirect:/casarepository/casa";
		}
		
		@RequestMapping("/CasasdeShow")
		public ModelAndView pesquisarcasa() {
			List<Casa> todosCasa = casarepository.findAll();
			ModelAndView mv = new ModelAndView("CadastroCasaDeShow");
			mv.addObject("casa", todosCasa);
			return mv;
		}
		
		@RequestMapping("/eventos")
		public ModelAndView pesquisarevento() {
			List<Evento> todosEvento = eventorepository.findAll();
			ModelAndView mv = new ModelAndView("CadastroEvento");
			mv.addObject("evento", todosEvento);
			return mv;
		}
		
		@ModelAttribute("todosGenero")
		public List<Genero> todosGenero() {
			return Arrays.asList(Genero.values());
		}	
		
		@ModelAttribute("todosOpcaoCasa")
		public List<OpcaoCasa> todosOpcaoCasa() {
			return Arrays.asList(OpcaoCasa.values());
		}
		
	}


















