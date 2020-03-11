package com.casadeshow.gerenciadordeeventos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casadeshow.gerenciadordeeventos.domain.Venda;
import com.casadeshow.gerenciadordeeventos.repository.Vendas;
import com.casadeshow.gerenciadordeeventos.service.exceptions.VendaNaoEncontradaException;

@Service
public class VendaService {

	@Autowired
	private Vendas vendas;
	
	public List<Venda> listar() {
	return vendas.findAll();
	}
	
	public Optional<Venda> buscar(Long id) {
	Optional<Venda> venda = vendas.findById(id);
	if (!venda.isPresent()) {
		throw new VendaNaoEncontradaException("Não foi possível encontrar a venda.");
	}
	return venda;
	}
}


