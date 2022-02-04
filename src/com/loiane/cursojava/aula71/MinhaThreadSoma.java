package com.loiane.cursojava.aula71;

public class MinhaThreadSoma implements Runnable{
	
	private String nome;
	private int[] numeros;
	private static Calculadora calc = new Calculadora();
	
	public MinhaThreadSoma(String nome, int[] numeros) {
		this.nome = nome;
		this.numeros = numeros;
		
//		Thread t = new Thread(this, nome);
//		t.start();
		new Thread(this, nome).start(); //outra forma de fazer 	
	}
	@Override
	public void run() {
		
		System.out.println(this.nome + " iniciada");
		int soma = calc.somaArray(this.numeros);
		
		System.out.println("Resultado da soma da thread "+this.nome+" é: "+soma);
		
		System.out.println(this.nome+ " finalizada");	
	}
}
