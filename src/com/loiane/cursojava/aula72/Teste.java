package com.loiane.cursojava.aula72;

public class Teste {

	public static void main(String[] args) {
		
		TiqueTaque tt = new TiqueTaque();

		ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
		ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);
		
		//m�todo join para que cada Thread aguarde a execu��o de cada uma, havendo sincroniza��o
		try {
			tique.t.join();
			taque.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
