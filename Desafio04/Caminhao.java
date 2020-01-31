package main;

public class Caminhao extends Veiculo {
	private String tipo;
	private int uso;
	
	
	public Caminhao(String modelo, int velocidade, int passageiros, int combustivel, String tipo, int uso) {
		super(modelo, velocidade, passageiros, combustivel);
		this.tipo = tipo;
		this.uso = uso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getUso() {
		return uso;
	}

	public void setUso(int uso) {
		this.uso = uso;
	}
	

	public void abastecer(float qtd) {
		setCombustivel((int) (getCombustivel() + qtd));
		System.out.println("O caminhao ja foi abastecido, agora ele esta com " + getCombustivel() + "litros de combustivel");
	}
	
	public void acelerar() {
		setVelocidade(getVelocidade() + 50);
		setCombustivel(getCombustivel() - 1);
        System.out.println("A velocidade do caminhao é de " + getVelocidade() + "km/h contendo " + getCombustivel() + " litros" );
	}
	
	@Override
	public String toString() {
		return "Caminhao [tipo=" + tipo + ", uso=" + uso + "]";
	}

	
	
}
