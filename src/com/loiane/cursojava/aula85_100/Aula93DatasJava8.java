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
		
		//padrão ISO conforme o Locale da máquina
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		System.out.println(LocalDate.of(1994, 04, 24));
		//Data em String, desde que esteja seguindo o formato ISO
		System.out.println(LocalDate.parse("1994-04-24"));
		
		//Adição em datas
		System.out.println(agora.plusDays(30));
		
		//Subtração em datas
		System.out.println(agora.minusDays(30));
		//Outra forma de substrair data, passando como parâmetro a quantidade que será subtraída 
		//e a unidade de tempo em Enum(ChronoUnit.MONTHS ou .DAYS e etc...) 
		System.out.println(agora.minus(1, ChronoUnit.MONTHS));
		
		//Para pegar dia do mês, semana, ano...
		System.out.println(agora.getDayOfWeek());
		System.out.println(agora.getDayOfMonth());
		System.out.println(agora.getDayOfYear());
		
		//Análise de ano bissexto
		System.out.println(agora.isLeapYear());
		
		//padrão Militar de hora, conforme a ISO da Locale da máquina
		LocalTime agoraT = LocalTime.now();
		System.out.println(agoraT);
		
		//Impressão de hora específica
		System.out.println(LocalTime.of(10, 30));
		//Hora em String, desde que esteja seguindo o formato ISO
		System.out.println(LocalTime.parse("15:30:47"));
		
		//Adição em horas
		System.out.println(agoraT.plusMinutes(60));
		//Subtração em hora
		System.out.println(agoraT.minusHours(1));
		System.out.println(agoraT.minus(30, ChronoUnit.MINUTES));
		
		//Para pegar somente a informação de hora, minuto e etc...
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
		
		//Retorna o fuso padrão do sistema
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		//Para verificar Time Zones do Java
		//Set é uma lista de objetos que não se repetem
		Set<String> fusos = ZoneId.getAvailableZoneIds();
		for(String f : fusos) {
			System.out.println(f);
		}
		
		//Para criar um objeto com outro fuso
		ZoneId nz = ZoneId.of("NZ");
		System.out.println(nz);
		
		//Data e horario com fuso horário
		ZonedDateTime zdt =  ZonedDateTime.of(LocalDateTime.parse("2022-02-15T09:55"), nz);
		System.out.println(zdt);
		
		//Outra forma de transformação da String, porém, pela instância do objeto
		System.out.println(ZonedDateTime.parse("2022-02-15T09:55+13:00[NZ]"));
		
		//Tabalhando com Offset - Adicionando horas ao fuso
		ZoneOffset zof = ZoneOffset.of("+13:00");
		 //Vendo a data calculada
		OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, zof);
		System.out.println(offsetdt);
			
		//Conversão de objeto Date ou Calendar para a API mais recente
		
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), nz);
		System.out.println(ldtDate);
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), nz));
		
	}
}
