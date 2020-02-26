package com.gerenciadordeeventos.casadeshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenciadordeeventos.model.Casadeshow;

	@Repository
	public interface CasaRepository extends JpaRepository<Casadeshow, Long> {

	}
