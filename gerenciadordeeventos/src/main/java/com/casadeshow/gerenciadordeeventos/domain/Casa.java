package com.casadeshow.gerenciadordeeventos.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;


import io.swagger.annotations.ApiModelProperty;

@Entity
public class Casa {

	@ApiModelProperty(example = "1")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEvento;
	
	@ApiModelProperty(example = "Aline")
	@NotEmpty(message = "Esse campo não pode estar vazio.")
	private String nome;
	
	@ApiModelProperty(example = "José Domakoski,300")
	@NotEmpty(message="O campo endereço é obrigatório")
	private String endereco;
	
	@OneToMany(mappedBy="casa", cascade = CascadeType.ALL)
	private List<Evento> evento;

	public long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Evento> getEvento() {
		return evento;
	}

	public void setEvento(List<Evento> evento) {
		this.evento = evento;
	}
	
	
}
