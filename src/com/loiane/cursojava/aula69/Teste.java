package com.loiane.cursojava.aula69;

import com.loiane.cursojava.aula67.MinhaThread;

public class Teste {
	
	public static void main(String[] args) {
	MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread nº1", 500);
	MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread nº2", 500);
	MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread nº3", 500);
	Thread t1 = new Thread(thread1);
	Thread t2 = new Thread(thread2);
	Thread t3 = new Thread(thread3);
	t1.start();
	t2.start();
	t3.start();
	
	for(int i = 0;i<15;i++){		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	System.out.println("Programa finalizado");	
	}
}