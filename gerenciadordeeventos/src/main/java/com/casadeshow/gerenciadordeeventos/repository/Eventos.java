package com.casadeshow.gerenciadordeeventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casadeshow.gerenciadordeeventos.domain.Evento;

@Repository
public interface Eventos extends JpaRepository<Evento, Long> {

}
