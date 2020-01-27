package carro;

public class Main {
	public static void main(String [] args) {
		Carro c = new Carro();
		c.ligar();
		c.abastecer(50);
		c.acelerar();
		c.frear();
		c.pintar("rosa");
		c.desligar();
		
	}
}
