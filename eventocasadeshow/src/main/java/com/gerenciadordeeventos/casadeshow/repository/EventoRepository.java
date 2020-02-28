package com.gerenciadordeeventos.casadeshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenciadordeeventos.casadeshow.model.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

}
