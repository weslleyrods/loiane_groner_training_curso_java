package com.loiane.cursojava.aula85_100;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance(); //singleton
		
		System.out.println(hoje);
		
		//ANO
		int ano = hoje.get(Calendar.YEAR);
		System.out.println(ano);

		//M�S - come�a em 0
		int mes = hoje.get(Calendar.MONTH);
		System.out.println(mes);
		int mesJan = hoje.get(Calendar.JANUARY);
		System.out.println(mesJan);
		int mesFeb = hoje.get(Calendar.FEBRUARY);
		System.out.println(mesFeb);

		//DIA - h� diversas op��es de dia, como; dia do m�s, ano, semana
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		System.out.println(dia);
		
		//HORA - h� diversas op��es de hora, como; dia e hora militar
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora);
		int minuto = hoje.get(Calendar.MINUTE);
		
		System.out.printf("Hoje �: %02d/%d/%d as %d:%d horas\n", dia, (mes+1), ano, hora, minuto);
		
		hoje.add(Calendar.MONTH, 1);
		hoje.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(hoje.get(Calendar.MONTH));
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
	}

}
