package app;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppTest {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime start = LocalDateTime.parse("25/08/2019 10:30", fmt);
		LocalDateTime end = LocalDateTime.parse("27/08/2019 11:30", fmt);
		
		long diff = Duration.between(start, end).toMinutes();
		
		double minutes = diff / 60.0;
		
		double hours = minutes / 24.0;
		
		double around = Math.ceil(hours);
		
		System.out.println("Diff: " + diff);
		System.out.println("Minutes: " + minutes);
		System.out.println("Hours: " + hours);
		System.out.println("Around:  " + around);
		
	}
}
