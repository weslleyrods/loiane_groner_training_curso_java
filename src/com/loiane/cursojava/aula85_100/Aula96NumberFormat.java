package com.loiane.cursojava.aula85_100;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class Aula96NumberFormat {

	public static void main(String[] args){
		
		Locale en = new Locale("en", "United States");		
		NumberFormat nf = NumberFormat.getInstance(en);	
		String num = nf.format(100.99);
		System.out.println(num);
		
		Locale br = new Locale("pt", "BR");
		NumberFormat nfBr = NumberFormat.getInstance(br);
		String numBr = nfBr.format(100.99);
		System.out.println(numBr);
		
		//MOEDA
		//O método getCurrencyInstance() pega a formatação desejada de um NumberFormat
		//mas também é possível pegar a formatação conforme a Locale
		NumberFormat moeda = NumberFormat.getCurrencyInstance(en);
		
		String valor = moeda.format(100.99);
		System.out.println(valor);
		
		//Para o exemplo de Moeda
		NumberFormat moeda2 = NumberFormat.getCurrencyInstance(Locale.getDefault());
		//pega o objeto moeda a partir do objeto NumberFormat
		Currency currency = moeda2.getCurrency();		
		System.out.println(currency);
		
		//PORCENTAGEM
		//O método getPercenteInstance() pega a formatação desejada de um NumberFormat
		//mas também é possível pegar a formatação conforme a Locale
		NumberFormat porcent = NumberFormat.getPercentInstance();
		String porcentagem = porcent.format(99.987);
		System.out.println(porcentagem);
		//definindo minimo e máximo para inteiros
		porcent.setMaximumIntegerDigits(4);
		porcent.setMinimumIntegerDigits(1);
		
		porcent.setMaximumFractionDigits(3);
		porcent.setMinimumFractionDigits(1);
		String porcentagem2 = porcent.format(10.987);
		System.out.println(porcentagem2);
		
		//ARREDONDAMENTO
		
		nf = NumberFormat.getInstance();
		
		nf.setRoundingMode(RoundingMode.HALF_UP);
		nf.setMaximumFractionDigits(0);
		nf.setMinimumFractionDigits(0);
		System.out.println(nf.format(99.50));
		
		Number num3;
		try {
			num3 = nf.parse("100.00");
			System.out.println(num3.intValue());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
