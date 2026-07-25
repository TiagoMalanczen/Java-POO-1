package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Converter {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2026-07-29");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
		
		System.out.println(d01.format(fmt01));
		System.out.println(fmt01.format(d01));
		
		System.out.println();
		
		System.out.println(d02.format(fmt02));
		System.out.println(fmt02.format(d02));
		
		System.out.println();
		
		System.out.println(fmt03.format(d03));
		
		System.out.println(fmt04.format(d02));
		
	}
}
