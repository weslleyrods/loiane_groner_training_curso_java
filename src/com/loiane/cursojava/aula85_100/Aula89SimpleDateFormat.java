package com.loiane.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//		Calendar data = new GregorianCalendar(2022, 1, 14, 10, 44);
//		System.out.println(sdf.format(data.getTime()));
		
		//Exemplo 2
		Date dataEmDate = new Date();
		System.out.println(sdf.format(dataEmDate));
		
		//Exemplo 3
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "14/02/2022";
		
		try {
			Date minhaDataEmDate = sdf1.parse(minhaData);
			System.out.println(minhaDataEmDate);
			
			//Para impress�o de forma mais amig�vel
			//o hor�rio por padr�o ir� sair 00:00:00, pois n�o h� hor�rio definido da String e SimpleDateFormat
			System.out.println(sdf1.format(minhaDataEmDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
