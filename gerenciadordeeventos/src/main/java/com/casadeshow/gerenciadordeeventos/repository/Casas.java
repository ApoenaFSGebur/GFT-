package com.casadeshow.gerenciadordeeventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Casas extends JpaRepository<Casas, Long> { 

}
