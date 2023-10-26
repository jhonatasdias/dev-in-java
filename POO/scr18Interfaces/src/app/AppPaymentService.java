package app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contract;
import model.services.impl.PaypalService;

public class AppPaymentService {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		SimpleDateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.println("Numero do contrato: ");
		int number = sc.nextInt();
		System.out.println("Data (dd/mm/aaaa: " );
		LocalDateTime date = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Valor do Contrato: ");
		double totalValue = sc.nextDouble();
		System.out.println("Entre com o numero de parcelas: ");
		int installment = sc.nextInt();
		
		
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.println(contract.toString());
		
		
	}

}
