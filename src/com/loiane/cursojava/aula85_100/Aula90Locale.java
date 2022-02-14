package com.loiane.cursojava.aula85_100;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

	public static void main(String[] args) {

		//identifica o Locale padr�o da m�quina
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		Locale[] locales = Locale.getAvailableLocales();
		for (Locale loc : locales) {
			System.out.println("Nome: "+loc.getDisplayName());
			System.out.println("C�digo da l�ngua: "+loc.getLanguage());
			System.out.println("Lingua: "+loc.getDisplayLanguage());
			System.out.println("C�digo do pa�s: "+loc.getCountry());
			System.out.println("Pa�s: "+loc.getDisplayCountry());
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
