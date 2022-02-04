package com.loiane.cursojava.aula71;

public class Teste {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
		MinhaThreadSoma t1 = new MinhaThreadSoma("Thread nº1", array);
		MinhaThreadSoma t2 = new MinhaThreadSoma("Thread nº2", array);	
	}
}
