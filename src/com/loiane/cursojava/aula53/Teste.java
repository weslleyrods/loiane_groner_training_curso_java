package com.loiane.cursojava.aula53;

public class Teste {

	public static void main(String[] args) {
		
		
		usandoEnum();
		usandoConstant();

	}
	
	public static void usandoEnum(){
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println("\nUsando o conceito de Enum\n");

		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}
	
	public static void imprimeDiaSemana(DiaSemana dia) {
		
			switch (dia) {
			case SEGUNDA:
				System.out.println("Segunda-feira!");
				break;
			case TERCA:
				System.out.println("Terça-feira!");
				break;
			case QUARTA:
				System.out.println("Quarta-feira!");
				break;
			case QUINTA:
				System.out.println("Quinta-feira!");
				break;
			case SEXTA:
				System.out.println("Sexta-feira!");
				break;
			case SABADO:
				System.out.println("Sabado-feira!");
				break;
			case DOMINGO:
				System.out.println("Doming-feira!");
				break;
			default:
				break;
			}
			
		}
	
	public static void usandoConstant() {
		int segunda = DiaSemanaConstant.SEGUNDA;
		int terca = DiaSemanaConstant.TERCA;
		int quarta = DiaSemanaConstant.QUARTA;
		int quinta = DiaSemanaConstant.QUINTA;
		int sexta = DiaSemanaConstant.SEXTA;
		int sabado = DiaSemanaConstant.SABADO;
		int domingo = DiaSemanaConstant.DOMINGO;
		
		
		System.out.println("\nUsando o conceito de Constant\n");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}
	
public static void imprimeDiaSemana(int dia) {
		
		switch (dia) {
		case 1:
			System.out.println("Segunda-feira!");
			break;
		case 2:
			System.out.println("Terça-feira!");
			break;
		case 3:
			System.out.println("Quarta-feira!");
			break;
		case 4:
			System.out.println("Quinta-feira!");
			break;
		case 5:
			System.out.println("Sexta-feira!");
			break;
		case 6:
			System.out.println("Sabado-feira!");
			break;
		case 7:
			System.out.println("Doming-feira!");
			break;
		default:
			break;
		}	
	}
}

