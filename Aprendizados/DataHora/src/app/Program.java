package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2026-07-20");
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		
		
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d05 = LocalDate.parse("13/08/2026", fmt01);
		LocalDateTime d06 = LocalDateTime.parse("13/08/2026 13:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		System.out.println(d05);
		System.out.println(d06);
		
		LocalDate d07 = LocalDate.of(2026, 3, 7);
		
		System.out.println(d07);
	}
}
