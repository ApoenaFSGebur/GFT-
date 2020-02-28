package com.gerenciadordeeventos.casadeshow.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gerenciadordeeventos.casadeshow.model.Casa;
import com.gerenciadordeeventos.casadeshow.model.Genero;
import com.gerenciadordeeventos.casadeshow.model.OpcaoCasa;
import com.gerenciadordeeventos.casadeshow.repository.CasaRepository;
import com.gerenciadordeeventos.casadeshow.repository.EventoRepository;
import com.gerenciadordeeventos.casadeshow.model.Evento;

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
			mv.addObject("todosGenero", Genero.values());
			mv.addObject("todosOpcaoCasa", OpcaoCasa.values());
			
			return mv;
			
//			public ModelAndView pesquisar() {
//				List<Evento> todosEventos = eventos.findAll();
//				List<Casa> todasCasas = casas.findAll();
//				ModelAndView mv = new ModelAndView("CadastroEvento");
//				Evento evento = new Evento();
//				mv.addObject(evento);
//				mv.addObject("eventos", todosEventos);
//				mv.addObject("casaShow", todasCasas);
//				return mv;

		}

		@RequestMapping(value ="/eventosave", method = RequestMethod.POST)
		public ModelAndView eventosave(Evento evento) {
			eventorepository.save(evento);
		
			ModelAndView mv = new ModelAndView("CadastroEventos");
			mv.addObject("mensagem", "Concluído com sucesso!");
			return mv;

		}

		@RequestMapping(value ="/casasave", method= RequestMethod.POST)
		public ModelAndView casasave(Casa casa) {
			casarepository.save(casa);
			
			ModelAndView mv = new ModelAndView("CadastroCasaDeShow");
			mv.addObject("mensagem", "Concluído com sucesso!");
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


















