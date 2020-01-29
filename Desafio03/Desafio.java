package main;

public class Desafio {

	public static void main(String[] args) {
		
		Carro c = new Carro ("Logan", 180, 4, 150,"Renault", 4, 2020);
		Aviao a = new Aviao ("Bombardier Challenger 350", 180, 5, 250, "Particular", 1);		
				
		System.out.println(c.toString());
		System.out.println(a.toString());
	}

}
