package com.gerenciadordeeventos.casadeshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenciadordeeventos.model.Evento;


	@Repository
	public interface EventosRepository extends JpaRepository<Evento, Long> {

	}

