package com.loiane.cursojava.aula74.labs;

public class TesteSemaforo {

	public static void main(String[] args) {

		MinhaThread semaforo = new MinhaThread();
		
		for(int i=0; i<10;i++) {
			System.out.println(semaforo.getCor());
			semaforo.esperaCorMudar();
		}
		semaforo.desligarSemaforo();
	}

}
