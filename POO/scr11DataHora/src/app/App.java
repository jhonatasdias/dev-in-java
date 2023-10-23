package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class App {

	public static void main(String[] args) {
		
		LocalDate now1 = LocalDate.now();
		LocalDateTime now2 = LocalDateTime.now();
		Instant now3 = Instant.now();
		
		System.out.println(now1);
		System.out.println(now2);
		System.out.println(now3);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date1 = LocalDate.parse("22/10/2023", fmt1);
		
		System.out.println(date1.format(fmt1));
		
		LocalDate date2 = LocalDate.parse("25/11/2023", fmt1);
		
		// without seconds
		Period difference1 = Period.between(date1, date2);
		
		// With seconds
		Duration difference2 = Duration.between(date1.atTime(0,0), date2.atTime(0, 0));
		
		System.out.println(difference1.getDays());
		
		System.out.println(difference2.toDays());
			
	}

}
