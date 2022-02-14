package com.loiane.cursojava.aula85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		TimeZone tz = calendar.getTimeZone();
		
		System.out.println(tz);
		
//		String[] fusos = TimeZone.getAvailableIDs();
//		for (String fuso : fusos) {
//			System.out.println(fuso);
//		}
		
		TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
		System.out.println(tzNY.getDisplayName());
		System.out.println(tzNY.getID());
		
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));
		
		Calendar agoraNY = Calendar.getInstance();
		System.out.println(agoraNY.getTimeZone());
		System.out.println(sdf.format(agoraNY.getTime()));
		
		agoraNY.add(Calendar.HOUR_OF_DAY, tzNY.getOffset((System.currentTimeMillis())) /1000/60/60);
		System.out.println(sdf.format(agoraNY.getTime()));
	}
}
