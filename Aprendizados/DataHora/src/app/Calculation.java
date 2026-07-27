package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculation {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2021-10-09");
		LocalDateTime d02 = LocalDateTime.parse("2022-02-07T01:30");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		System.out.println(d01);
		
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextweekLocalDate = d01.plusDays(7); 
		System.out.println();
		System.out.println(pastWeekLocalDate);
		System.out.println(nextweekLocalDate);
		
		System.out.println("============");
		
		System.out.println(d02); 
		
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextweekLocalDateTime = d02.plusDays(7);
		System.out.println();
		System.out.println(pastWeekLocalDateTime);
		System.out.println(nextweekLocalDateTime);
		
		System.out.println("============");
		
		System.out.println(d03); 
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		System.out.println();
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		
		Duration d1 = Duration.between(pastWeekInstant, nextWeekInstant);
		Duration d2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
		Duration d3 = Duration.between(nextWeekInstant, pastWeekInstant);
		
		System.out.println(d1.toDays());
		System.out.println(d2.toHours());	
		System.out.println(d3.toDays());
	}
}
