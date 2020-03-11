package com.casadeshow.gerenciadordeeventos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casadeshow.gerenciadordeeventos.domain.Usuario;
import com.casadeshow.gerenciadordeeventos.repository.Usuarios;
import com.casadeshow.gerenciadordeeventos.service.exceptions.UsuarioNaoEncontradoException;

@Service
public class UsuarioService {

	@Autowired
	private Usuarios Usuarios;

	public List<Usuario> listar() {
		return usuarios.findAll();
	}

	public Optional<Usuario> buscar(Long id) {
			Optional<Usuario> usuario = usuarios.findById(id);
			
			if (!usuario.isPresent()) {
				throw new  UsuarioNaoEncontradoException("Não foi possível encontrar o usuário");

			}
			return usuario;
		}
}
