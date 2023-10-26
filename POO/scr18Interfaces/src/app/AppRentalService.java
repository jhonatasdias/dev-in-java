package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.RentalService;
import model.services.impl.BrazilTaxService;

public class AppRentalService {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel:");
		System.out.println("Modelo do caro:");
		String model = sc.nextLine();
		System.out.println("Retirada :");
		LocalDateTime dateStart = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Saida: ");
		LocalDateTime dateFinish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental rental = new CarRental(dateStart, dateFinish, new Vehicle(model));
		
		System.out.println("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.println("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(rental);
		
		System.out.println(rental.getInvoice().toString());

		sc.close();
	}

}
