package com.loiane.cursojava.aula85_100;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

	public static void main(String[] args) {

		//identifica o Locale padrão da máquina
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		Locale[] locales = Locale.getAvailableLocales();
		for (Locale loc : locales) {
			System.out.println("Nome: "+loc.getDisplayName());
			System.out.println("Código da língua: "+loc.getLanguage());
			System.out.println("Lingua: "+loc.getDisplayLanguage());
			System.out.println("Código do país: "+loc.getCountry());
			System.out.println("País: "+loc.getDisplayCountry());
			System.out.println("_________________");
		}
		
		Locale br = new Locale("pt", "BR");
		System.out.println(br);
		Locale.setDefault(br);
		System.out.println(Locale.getDefault());
		
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(50000d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(nf2.format(50000d));
		
	}

}
