package com.loiane.cursojava.aula54;

public class Formulario {

	public static void main(String[] args) {
		
		String nome;
		Genero genero = Genero.MASCULINO;
		
		System.out.println("O gênero de Joel é: " +genero.getValor());
		

	}
	
	enum Genero{
		
		MASCULINO('M'), FEMININO('F');
			
		private char valor;
		
		Genero(char valor){		
			this.valor = valor;		
		}

		public char getValor() {
			return valor;
		}
				
	}
}
