package com.loiane.cursojava.aula67;

public class Teste {

	public static void main(String[] args) {

		MinhaThread thread = new MinhaThread("Thread n�1", 500);
		MinhaThread thread2 = new MinhaThread("Thread n�2", 1000);
		MinhaThread thread3 = new MinhaThread("Thread n�3", 800);
		
		//thread.start();
	}
}
