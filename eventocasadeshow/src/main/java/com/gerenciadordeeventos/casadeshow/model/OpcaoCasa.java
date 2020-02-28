package com.gerenciadordeeventos.casadeshow.model;

public enum OpcaoCasa {
	
	CASA1("Casa1"),
	CASA2("Casa2"),
	CASA3("Casa3"); 

	private String descricao;

	
	private OpcaoCasa(String descricao) {
		this.descricao = descricao;
	}


	public String getDescricao() {
		return descricao;
	}



}
