package com.casadeshow.gerenciadordeeventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casadeshow.gerenciadordeeventos.domain.Usuario;

public interface Usuarios extends JpaRepository<Usuario, Long> {

}
