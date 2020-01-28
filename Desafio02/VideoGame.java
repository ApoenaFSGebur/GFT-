package main;

public class VideoGame extends Produto {
	
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
	
	

   public void calculaImposto() {
	   if (isUsado()) {
		   double imp = getPreco() *0.25;
		   System.out.println("Imposto" + getNome() + getModelo() + " usado , R$ " + imp);
      } else {
    	  double imp = getPreco() *0.45;
    	  System.out.println("Imposto" + getNome() + getModelo() + " novo, R$ " + imp);
      }
   }

   @Override
   public String toString() {
	   return "VideoGame: " + getModelo() + ", preço: " + getPreco() + ",quantidade: " + getQtd() + " em estoque."; 			
 }
}
   
   
   
   
   
   
   
   
   
   
   
   
   
