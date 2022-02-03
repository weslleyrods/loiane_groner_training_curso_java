package com.loiane.cursojava.aula64;

public class Anonima {

	public void imprimeTexto(){
		System.out.println("qualquer texto");
	}
	
	public static void main(String[] args){
		
		Anonima anonima = new Anonima(){ //Chamada do construtorm
			public void imprimeTexto(){
				System.out.println("qualquer texto que foi sobrescrito");
			}
		};
		
		anonima.imprimeTexto();
		
		//usando interface
		Texto texto = new Texto() { //Instancia da Interface
			@Override
			public void imprimeTexto() { //chamada obrigatória do método da Inteface
				System.out.println("qualquer texto - interface");
			}
		};
		
		texto.imprimeTexto();
	}
}
