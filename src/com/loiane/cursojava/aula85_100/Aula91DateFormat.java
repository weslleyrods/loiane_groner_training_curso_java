package com.loiane.cursojava.aula85_100;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		System.out.println(hoje);
		System.out.println(Locale.getDefault()); //identifica o Locale padrão da máquina
		
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado); //imprimi a data no formato do Locale padrão
		
		Locale.setDefault(new Locale("pt", "BR")); //altera o Locale padrão
		System.out.println(Locale.getDefault());
		
		hojeFormatado = DateFormat.getInstance().format(hoje); //data completa
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateInstance().format(hoje);//somente a data
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance().format(hoje); //comente a hora
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje); //data e hora
		System.out.println(hojeFormatado);
		
		
		//Outros meios de definir o formato de data e hora
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		hojeFormatado = DateFormat.getDateInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado);
		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		//Definindo data em String para Date com DateFormat
		String data = "24/04/1994 10:30";
		try {
			Date dataDate = DateFormat.getInstance().parse(data);
			System.out.println(dataDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
