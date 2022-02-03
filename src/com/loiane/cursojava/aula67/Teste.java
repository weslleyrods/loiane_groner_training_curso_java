package com.loiane.cursojava.aula67;

public class Teste {

	public static void main(String[] args) {

		MinhaThread thread = new MinhaThread("Thread nº1", 500);
		MinhaThread thread2 = new MinhaThread("Thread nº2", 1000);
		MinhaThread thread3 = new MinhaThread("Thread nº3", 800);
		
		//thread.start();
	}
}
