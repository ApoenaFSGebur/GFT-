package com.casadeshow.gerenciadordeeventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casadeshow.gerenciadordeeventos.domain.Venda;

@Repository
public interface Vendas extends JpaRepository<Venda, Long> {


}
