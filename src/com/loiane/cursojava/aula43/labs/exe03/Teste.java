package com.loiane.cursojava.aula43.labs.exe03;

public class Teste {

	public static void main(String[] args) {
		
		Animal camelo = new Animal("Camelo",150, 0, "Amarelo", "Terra",2.0);
		Peixe tubarao = new Peixe("Tubarão",300, 0, null, null, 1.5, null);
		Mamifero urso = new Mamifero("Urso-do-Canadá", 180, 4, "Vermelho", null, 0.5, "Mel");
		
		
		Animal [] animais = new Animal[3];
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = urso;
		System.out.println("ZOO:\n ");
		System.out.println("--------------------");
		for(Animal a: animais){
			System.out.println(a);
			System.out.println("\n--------------------");
		}
	}

}
