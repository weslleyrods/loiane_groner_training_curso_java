package com.loiane.cursojava.aula72;

public class Teste {

	public static void main(String[] args) {
		
		TiqueTaque tt = new TiqueTaque();

		ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
		ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);
		
		//método join para que cada Thread aguarde a execução de cada uma, havendo sincronização
		try {
			tique.t.join();
			taque.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
