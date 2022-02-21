package com.loiane.cursojava.aula85_100;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula97DecimalFormat {

	public static void main(String[] args) {

		String padrao = "###,###.##"; //Formato EUA
		DecimalFormat df = new DecimalFormat(padrao);
//		df.applyLocalizedPattern();
//		df.applyPattern(padrao);
		System.out.println(df.format(168465489.12));//168,465,489.12
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');	//decimais
		dfs.setGroupingSeparator('.'); //milhares
		
		String padrao2 = "###,###.##"; //Formato EUA
		df = new DecimalFormat(padrao2, dfs);
		System.out.println(df.format(168465489.12));
		
		String padrao3 = "###,#####.##"; 
		df = new DecimalFormat(padrao3, dfs);
		df.setGroupingSize(5);
		System.out.println(df.format(168465489.14));
		
		String padrao4 = "###,###.00"; 
		df = new DecimalFormat(padrao4, dfs);
		System.out.println(df.format(168465489.123));
	} 

}
