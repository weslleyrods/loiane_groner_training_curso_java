package com.loiane.cursojava.aula56.labs;

public class Calculadora {

	public static void main(String[] args) {

		double x = 10.0;
		double y = 15.0;
		
		for (Operacao operacoes : Operacao.values()) {			
			System.out.println(x + " " + operacoes + " "+ y + " = "+ operacoes.executarOperacao(x, y));		
		}
		

	}

}
