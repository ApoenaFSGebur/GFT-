package com.casadeshow.gerenciadordeeventos.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Venda {


	@ApiModelProperty(example = "1")
	@JsonInclude(Include.NON_NULL)
	private Long eventoId;
	
	@ApiModelProperty(example = "2")
	@JsonInclude(Include.NON_NULL)
	private Long usuarioId;
	 
	@ApiModelProperty(example = "3")
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEvento;

	public Long getEventoId() {
		return eventoId;
	}

	public void setEventoId(Long eventoId) {
		this.eventoId = eventoId;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}
	
	
}
