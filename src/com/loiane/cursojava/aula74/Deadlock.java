package com.loiane.cursojava.aula74;

public class Deadlock {

	public static void main(String[] args) {

		final String RECURSO1 = "Recurso nº1";
		final String RECURSO2 = "Recurso nº2";

		Thread t1 = new Thread() {
			public void run(){			
				synchronized(RECURSO1){
					System.out.println("Thread nº1 bloqueou o recurso 1");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Thread nº1 tentando acesso ao recurso 2");
					
					synchronized(RECURSO2){
						System.out.println("Thread nº1 bloqueou o recurso 2");
					}
				}
			}	
		};
		Thread t2 = new Thread() {
			public void run(){			
				synchronized(RECURSO2){
					System.out.println("Thread nº2 bloqueou o recurso 2");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Thread nº2 tentando acesso ao recurso 2");
					
					synchronized(RECURSO1){
						System.out.println("Thread nº2 bloqueou o recurso 1");
					}
				}
			}	
		};	
		t1.start();
		t2.start();		
	}
}


