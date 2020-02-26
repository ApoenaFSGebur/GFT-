package com.gerenciadordeeventos.model;

public enum OpcoesdeCasa {

	CASA1("Casa1"),
	CASA2("Casa2"),
	CASA3("Casa3"); 

private String nome;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

private OpcoesdeCasa(String nome) {
	this.nome = nome;
}

private OpcoesdeCasa() {
}
	

}


