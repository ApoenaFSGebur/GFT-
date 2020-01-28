package main;

public class Livro extends Produto {

	private String autor;
	private String tema;
	private int qtdPag;
	
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	
	public void calculaImposto() {
	    if (this.getTema() ==  "educativo") {
	    	System.out.println("Livros de tema educativo nao tem imposto " + getNome());
	    } else {
	    	double imp = getPreco() * 0.1d;
	    	System.out.println("R$ " + imp + " de impostos sobre o livro " + getNome());
	    }
    }	
	@Override
	public String toString() {
		return "Titulo: " + getNome() + ", preço: " + getPreco() + ", quantidade:" + getQtd() + " em estoque";
	}

}
	
	
	
