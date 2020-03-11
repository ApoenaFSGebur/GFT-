package com.casadeshow.gerenciadordeeventos.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Evento {
	
	@ApiModelProperty(example = "1")
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEvento;
	
	@ManyToOne
	@JoinColumn(name="casa_id")
	@JsonInclude(Include.NON_NULL)
	private Casa casa;
	
	@ApiModelProperty(example = "Aline")
	@NotEmpty(message = "Esse campo não pode estar vazio.")
	private String nome;
	
	@ApiModelProperty(example = "02/02/2020")
	@JsonInclude(Include.NON_NULL)
	@JsonFormat(pattern = "dd/MM/yyyy")
	@NotNull(message="Esse campo é obrigatório")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@ApiModelProperty(example = "1000")
	@NotNull(message="A capacidade é obrigatória")
	@Min(0)
	@JsonInclude(Include.NON_NULL)
	private int capacidade;
	
	@ApiModelProperty(example = "100.00")
	@NotNull(message="O valor é obrigatório")
	@DecimalMin(value = "0.00", message = "O valor não pode ser menor que R$ 0,00")
	@DecimalMax(value = "999999.99", message = "O valor não pode ser maior que R$ 999.999,99")
	@JsonInclude(Include.NON_NULL)
	private BigDecimal precoIngresso;
	

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public Casa getCasa() {
		return casa;
	}

	public void setCasa(Casa casa) {
		this.casa = casa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public BigDecimal getPrecoIngresso() {
		return precoIngresso;
	}

	public void setPrecoIngresso(BigDecimal precoIngresso) {
		this.precoIngresso = precoIngresso;
	}


	
	
}
