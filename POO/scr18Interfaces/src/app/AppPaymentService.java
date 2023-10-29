package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.impl.PaypalService;

public class AppPaymentService {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.println("Numero do contrato: ");
		int number = sc.nextInt();
		System.out.println("Data (dd/mm/aaaa: ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.println("Valor do Contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.println("Entre com o numero de parcelas: ");
		int months = sc.nextInt();
		
		ContractService service = new ContractService(new PaypalService());
		
		service.processContract(contract, months);
		
		System.out.println(contract.toString());
		
		List<Installment> list = contract.getInstallments();
		
		System.out.println("Parcelas:");
		for( Installment elem : list ) {
			System.out.println(elem.toString());
		}
		
		sc.close();
		
		
	}

}
