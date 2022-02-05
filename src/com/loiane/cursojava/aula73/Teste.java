package com.loiane.cursojava.aula73;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThread t1 = new MinhaThread("n�1");
		MinhaThread t2 = new MinhaThread("n�2");
		
		System.out.println("Pausando a Thread n�1");

		t1.suspend();
		
		try {
			Thread.sleep(200);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("Pausando a Thread n�2");
		t2.suspend();
		
		System.out.println("Resumindo a Thread n�1");
		t1.resume();
		
		try {
			Thread.sleep(200);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("Resumindo a Thread n�2");
		t2.resume();
		
		System.out.println("Terminando a Thread n�2");
		t2.stop();
	}
}
