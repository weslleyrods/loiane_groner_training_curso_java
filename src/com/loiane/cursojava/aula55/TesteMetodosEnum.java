package com.loiane.cursojava.aula55;

public class TesteMetodosEnum {

	public static void main(String[] args) {
		
		
		
		DiaSemana [] dias = DiaSemana.values();
						
		for (DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
			
		}
		
		System.out.println("\n-- Teste do m�todo valueOf --\n");
		System.out.println(Enum.valueOf(DiaSemana.class, "SEGUNDA"));
		
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "TERCA");
		System.out.println(dia);
		
	}
	
}

