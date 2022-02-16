package com.loiane.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Aula94DiferencaEntreDatas {

	public static void main(String[] args) throws ParseException {
		
		System.out.println("--- Data até Java 7 ---");
		diferencaDataAteJava7();
		
		System.out.println("--- API Java 8 com Local Date ---");
		diferencaDataJava8();
		
		System.out.println("--- API Java 8 com LocalDateTime ---");
		diferencaDataJava8ComTempo();
	}
	
	//Date ou Calendar
	public static void diferencaDataAteJava7() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date primeiraDt = sdf.parse("16/02/2022");
		Date segundaDt = sdf.parse("16/03/2022");
		
		//Calculo da diferença
		//getTime retorna a data em milissegundos
		//com os milissegundos calculamos a diferença de datas
		long diffEmMili = Math.abs(segundaDt.getTime() - primeiraDt.getTime());
		
		//Com a diferença calculada em milisegundos
		//é possível realizar a conversão para dias de duas formas
		
		//1º forma - com TimeUnit
		long diff = TimeUnit.DAYS.convert(diffEmMili, TimeUnit.MILLISECONDS);
		System.out.println(diff);	
		
		//2º forma - método mais moderno
		int dias = (int) (diffEmMili / (1000 * 60 * 60 * 24));
		System.out.println(dias);
	}
	
	//API Java8+
	
	public static void diferencaDataJava8() {
		
		LocalDate data1 = LocalDate.of(2022, 02, 16);
		LocalDate data2 = LocalDate.of(2022, 03, 16);
		
		Period periodo = Period.between(data1, data2);
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();
		System.out.println("Dias: "+dias);
		System.out.println("Meses: "+meses);
		System.out.println("Anos: "+anos);
	}
	
	public static void diferencaDataJava8ComTempo() {
		
		LocalDateTime data1 = LocalDateTime.of(2022, 02, 16, 9, 36);
		LocalDateTime data2 = LocalDateTime.of(2022, 03, 16, 9, 36);
		
		Duration duracao = Duration.between(data1, data2);
		long diffdays = duracao.toDays();
		long diffhours = duracao.toHours();
		//Para meses/ano é necessário usar ChronoUnit	
		long diffmonth = ChronoUnit.MONTHS.between(data1, data2);
		//Para horas também é possivel usar o ChronoUnit
		long diffHoursChronoUnit = ChronoUnit.HOURS.between(data1, data2);
		
		System.out.println(diffdays);
		System.out.println(diffmonth);
		System.out.println(diffhours);
		System.out.println(diffHoursChronoUnit);
	}
	
	
}
