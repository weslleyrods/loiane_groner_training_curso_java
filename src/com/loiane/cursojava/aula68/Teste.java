package com.loiane.cursojava.aula68;

import com.loiane.cursojava.aula67.MinhaThread;

public class Teste {
	
	public static void main(String[] args) {
	MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread n�1", 800);
	MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread n�2", 1000);
	MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread n�3", 800);
	//Thread t1 = new Thread(thread1);
	//t1.start();
	
	}
}