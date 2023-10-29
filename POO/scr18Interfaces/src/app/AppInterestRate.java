package app;

import java.util.Scanner;

import model.services.InterestService;
import model.services.impl.BrazilInterestService;

public class AppInterestRate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Amount: ");
		double amount = sc.nextDouble();
		System.out.println("Months: ");
		int months = sc.nextInt();
		
		InterestService service = new BrazilInterestService(2.0);
		
		double result = service.payment(amount, months);
		
		System.out.println("Result: " + result);
		
		sc.close();
		
		
	}
	
}
