package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		// use DateTimeFormatter para formatações de hora
		DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d04 = LocalDate.parse("11/01/2023", ftm1);
		DateTimeFormatter ftm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		// formatando a data no padrão que escolhemos ofPattern com /
		System.out.println("d01 = " + d01.format(ftm1));
		System.out.println("d02 = " + d02.format(ftm2));
		//separando data dia, mes etc
		System.out.println("dia = " + d02.getDayOfMonth());
		System.out.println("mês = " + d02.getMonthValue());
		System.out.println("ano = " + d02.getYear());
		System.out.println("hora = " + d02.getHour());
		
		
		
		//zonas pelo mundo
//		for (String s : ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}
		
		
	}

}
