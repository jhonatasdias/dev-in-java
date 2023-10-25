package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.RentalService;
import model.services.impl.BrazilTaxService;

class RentalServiceTest {
	
	CarRental rental;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime start = LocalDateTime.parse("25/08/2019 10:30", fmt);
		LocalDateTime end = LocalDateTime.parse("27/08/2019 11:30", fmt);
		rental = new CarRental(start, end, new Vehicle("Civic"));
	}

	@Test
	void paymentTest() {
		
		double pricePerHour = 10.0;
		double pricePerDay = 130.0;
		
		RentalService service = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		service.processInvoice(rental);
		
		double resultPayment = rental.getInvoice().getBasicPayment();
		
		double expectedPayment = 390.0;
		
		assertEquals(expectedPayment, resultPayment);
	}
	
	@Test
	void taxTest() {
		
		double pricePerHour = 10.0;
		double pricePerDay = 130.0;
		
		RentalService service = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		service.processInvoice(rental);
		
		double resultTax = rental.getInvoice().getTax();
		
		double expectedTax = 58.5;
		
		assertEquals(expectedTax, resultTax);
	}

}
