package main;

public class Aviao extends Veiculo {
	private String tipo;
	private int uso;

	public Aviao(String modelo, int velocidade, int passageiros, int combustivel, String tipo, int uso) {
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

	@Override
	public String toString() {
		return "Aviao [tipo=" + tipo + ", uso=" + uso + "]";
	}
	
}

