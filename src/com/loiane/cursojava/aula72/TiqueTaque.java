package com.loiane.cursojava.aula72;

public class TiqueTaque {

	boolean tique;

	synchronized void tique(boolean estaExecutando) {

		if(!estaExecutando) {
			tique = true;
			notify(); //notifica a Thread Taque que e a Thread Tique não está sendo executada
			return;
		}

		System.out.print("Tique ");
		tique = true;	
		notify(); //notifica a Thread do Taque ela pode ser executada


		try {
			while(tique) {
				wait(); //enquanto for Tique, aguarda a execução da mesma
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized void taque(boolean estaExecutando) {

		if(!estaExecutando) {
			tique = false;
			notify(); //notifica a Thread Tique que e a Thread Taque não está sendo executada
			return;
		}

		System.out.println("Taque");
		tique = false;	
		notify(); //notifica a Thread do Tique ela pode ser executada


		try {
			while(!tique) {
				wait(); ////enquanto NÃO for Tique, aguarda a execução da mesma
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

