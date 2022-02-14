package com.loiane.cursojava.aula85_100;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GregorianCalendar {

	public static void main(String[] args) {

		Calendar hoje1 = Calendar.getInstance();

		GregorianCalendar hoje = new GregorianCalendar();

		//System.out.println(hoje);
		imprimirData(hoje);
		
		System.out.println(hoje.isLeapYear(2022));

	}

	private static void imprimirData(Calendar hoje) {
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minuto = hoje.get(Calendar.MINUTE);

		System.out.printf("Hoje é: %02d/%02d/%04d as %02d:%02d horas\n", dia, (mes+1), ano, hora, minuto);
	}
}
