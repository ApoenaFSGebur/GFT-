package com.gerenciadordeeventos.casadeshow.model;

public enum Genero {

	GENERO1("Eletronico"),
	GENERO2("Pop"),
	GENERO3("Sertanejo"),
	GENERO4("Reggae"),
	GENERO5("Rock"),
	GENERO6("Pagode"),
	GENERO7("Rap");
	
	private String descricaoestilo;

	private Genero(String descricaoestilo) {
		this.descricaoestilo = descricaoestilo;
	}

	public String getDescricaoestilo() {
		return descricaoestilo;
	}

	
	
}
