package carro;

public class Carro {
	
		private String marca;
		private String modelo;
		private String placa;
		private String cor;
		private float km;
		private boolean isLigado;
		private int litrosCombustivel;
		private int velocidade;
		private double preco;
	
		
		public Carro() {
			this.isLigado = isLigado;
			this.litrosCombustivel = litrosCombustivel;
			this.velocidade = velocidade;
			
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
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public float getKm() {
			return km;
		}
		public void setKm(float km) {
			this.km = km;
		}
		public boolean isLigado() {
			return isLigado;
		}
		public void setLigado(boolean isLigado) {
			this.isLigado = isLigado;
		}
		public int getLitrosCombustivel() {
			return litrosCombustivel;
		}
		public void setLitrosCombustivel(int litrosCombustivel) {
			this.litrosCombustivel = litrosCombustivel;
		}
		public int getVelocidade() {
			return velocidade;
		}
		public void setVelocidade(int velocidade) {
			this.velocidade = velocidade;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		public void acelerar() {
			if (isLigado()) {
				setVelocidade(getVelocidade() + 20);
				setLitrosCombustivel(getLitrosCombustivel() - 1);
	            System.out.println("A velocidade do carro é de " + getVelocidade() + "km/h contendo " + getLitrosCombustivel() + " litros" );
			} else {
				System.out.println("O carro está desligado");
			}	
		}
		public void ligar() {
			if (isLigado()) {
				System.out.println(" O carro ja esta ligado");
			} else {
				setLigado(true);
				System.out.println("O carro foi ligado");
			}
		}
		public void abastecer(int litros) {
			if (litros < 100) {
				setLitrosCombustivel(getLitrosCombustivel() + litros);
				System.out.println("O carro ja foi abastecido");
			} else {
				System.out.println(" Nao exceder 100 litros");
			}
			
		}
		public void frear() {
			if (isLigado() && getVelocidade() > 0) {
			   setVelocidade(getVelocidade() - 10);
			   System.out.println("O carro foi freado");
			} else {
				System.out.println(" O carro nao podera ser freado");
			}
		}
		public void pintar(String corNova) {
			setCor(corNova);
			System.out.println("A nova cor do carro é " + getCor());
		}
		public void desligar() {
			if (!isLigado()) {
				System.out.println("Desligado");
			} else {
				System.out.println(" O carro ja esta desligado");
			}
		}
	}


