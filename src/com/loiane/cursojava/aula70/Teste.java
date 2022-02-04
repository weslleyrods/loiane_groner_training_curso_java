package com.loiane.cursojava.aula70;

import com.loiane.cursojava.aula69.MinhaThreadRunnable;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread nº1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread nº2", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread nº3", 500);
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
			
		t1.setPriority(5);
		t2.setPriority(1);
		t3.setPriority(10);
		
		//t1.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();	
	}
}
