package main;

public class Carro extends Veiculo {
	private String marca;
	private int portas;
	private int ano;
	
	public Carro(String modelo, int velocidade, int passageiros, int combustivel, String marca, int portas, int ano) {
		super(modelo, velocidade, passageiros, combustivel);
		this.marca = marca;
		this.portas = portas;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	} 
	
	public void abastecer(int qtd) {
		setVelocidade(getVelocidade() + qtd);
		System.out.println(" O carro foi abastecido, está com" + getCombustivel() + "litros de combustivel");
	
	}

	public void acelerar() {
		setVelocidade(getVelocidade() + 20);
		setCombustivel(getCombustivel() - 1);
        System.out.println("A velocidade do carro é de " + getVelocidade() + "km/h contendo " + getCombustivel() + " litros" );
	}
	
	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", portas=" + portas + ", ano=" + ano + "]";
	}

	
}


