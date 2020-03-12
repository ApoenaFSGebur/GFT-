package com.casadeshow.gerenciadordeeventos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.casadeshow.gerenciadordeeventos.domain.Casa;
import com.casadeshow.gerenciadordeeventos.repository.Casas;
import com.casadeshow.gerenciadordeeventos.service.exceptions.CasaExistenteException;
import com.casadeshow.gerenciadordeeventos.service.exceptions.CasaNaoEncontradaException;

@Service
public class CasaService {

	@Autowired
	private Casas casas;

	public List<Casa> listar() {
		return casas.findAll();
	}

	public Casa salvar(Casa casa) {
		if (casa.getIdCasa() != 0L) {
			Optional<Casa> a = casas.findById(casa.getIdCasa());

			if (a.isPresent()) {
				throw new CasaExistenteException("Casa já existente.");
			}
		}
		return casas.save(casa);
	}

	public Casa buscar(Long id) {
		Optional<Casa> casa = casas.findById(id);
		if (!casa.isPresent()) {
			throw new CasaNaoEncontradaException("Não foi possível encontrar");
		}
		return casa.get();
	}

	public Casa buscarNome(String n) {
		try {
			return casas.findByNome(n);
		} catch (Exception e) {
			throw new CasaNaoEncontradaException("Não foi possível encontrar.");
		}

	}

	private void verExiste(Casa casa) {
		buscar(casa.getIdCasa());
	}

	public void excluir(Long id) {
		casas.deleteById(id);
	}

	public void atualizar(Casa casa) {
		verExiste(casa);
		casas.save(casa);
	}

	public List<Casa> listarNomeASC() {
		return casas.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}

	public List<Casa> listarNomeDESC() {
		return casas.findAll(Sort.by(Sort.Direction.DESC, "nome"));
	}
}
