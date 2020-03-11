package com.casadeshow.gerenciadordeeventos.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Usuario {

	@ApiModelProperty(example = "1")
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEvento;
	
	@ApiModelProperty(example = "Contribuidor")		
	@NotEmpty(message="A função é obrigatória")
	@JsonInclude(Include.NON_NULL)
	private String role;
	
	@ApiModelProperty(example = "alineribas@gmail.com")		
	@NotEmpty(message="O e-mail é obrigatório")
	@JsonInclude(Include.NON_NULL)	
	private String email; 
	
	@ApiModelProperty(example = "s3nh4")		
	@NotEmpty(message="A senha é obrigatória")
	@JsonIgnore
	private String senha;

	@ApiModelProperty(example = "Aline")		
	@NotEmpty(message="O nome é obrigatório")
	@JsonInclude(Include.NON_NULL)
	private String nome;

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
