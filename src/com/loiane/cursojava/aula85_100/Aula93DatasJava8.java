package com.loiane.cursojava.aula85_100;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93DatasJava8 {

	public static void main(String[] args) {
		
		//padr�o ISO conforme o Locale da m�quina
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		System.out.println(LocalDate.of(1994, 04, 24));
		//Data em String, desde que esteja seguindo o formato ISO
		System.out.println(LocalDate.parse("1994-04-24"));
		
		//Adi��o em datas
		System.out.println(agora.plusDays(30));
		
		//Subtra��o em datas
		System.out.println(agora.minusDays(30));
		//Outra forma de substrair data, passando como par�metro a quantidade que ser� subtra�da 
		//e a unidade de tempo em Enum(ChronoUnit.MONTHS ou .DAYS e etc...) 
		System.out.println(agora.minus(1, ChronoUnit.MONTHS));
		
		//Para pegar dia do m�s, semana, ano...
		System.out.println(agora.getDayOfWeek());
		System.out.println(agora.getDayOfMonth());
		System.out.println(agora.getDayOfYear());
		
		//An�lise de ano bissexto
		System.out.println(agora.isLeapYear());
		
		//padr�o Militar de hora, conforme a ISO da Locale da m�quina
		LocalTime agoraT = LocalTime.now();
		System.out.println(agoraT);
		
		//Impress�o de hora espec�fica
		System.out.println(LocalTime.of(10, 30));
		//Hora em String, desde que esteja seguindo o formato ISO
		System.out.println(LocalTime.parse("15:30:47"));
		
		//Adi��o em horas
		System.out.println(agoraT.plusMinutes(60));
		//Subtra��o em hora
		System.out.println(agoraT.minusHours(1));
		System.out.println(agoraT.minus(30, ChronoUnit.MINUTES));
		
		//Para pegar somente a informa��o de hora, minuto e etc...
		System.out.println(agoraT.getHour());
		System.out.println(agoraT.getMinute());
		
		//data completa = data + hora
		LocalDateTime agoraCompleto = LocalDateTime.now();
		System.out.println(agoraCompleto);
		
		System.out.println(LocalDateTime.of(1994, 4, 24, 10, 30));
		System.out.println(LocalDateTime.parse("1994-04-24T10:30"));
		System.out.println(agora.plusYears(5));
		System.out.println(agora.plusMonths(2));
		System.out.println(agora.plusWeeks(1));
		
		//Retorna o fuso padr�o do sistema
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		//Para verificar Time Zones do Java
		//Set � uma lista de objetos que n�o se repetem
		Set<String> fusos = ZoneId.getAvailableZoneIds();
		for(String f : fusos) {
			System.out.println(f);
		}
		
		//Para criar um objeto com outro fuso
		ZoneId nz = ZoneId.of("NZ");
		System.out.println(nz);
		
		//Data e horario com fuso hor�rio
		ZonedDateTime zdt =  ZonedDateTime.of(LocalDateTime.parse("2022-02-15T09:55"), nz);
		System.out.println(zdt);
		
		//Outra forma de transforma��o da String, por�m, pela inst�ncia do objeto
		System.out.println(ZonedDateTime.parse("2022-02-15T09:55+13:00[NZ]"));
		
		//Tabalhando com Offset - Adicionando horas ao fuso
		ZoneOffset zof = ZoneOffset.of("+13:00");
		 //Vendo a data calculada
		OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, zof);
		System.out.println(offsetdt);
			
		//Convers�o de objeto Date ou Calendar para a API mais recente
		
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), nz);
		System.out.println(ldtDate);
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), nz));
		
	}
}
