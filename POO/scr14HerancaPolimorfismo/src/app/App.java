package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.Employee;
import entities.OutSourcedEmployee;
import entities.SavingsAccount;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // formatação do output
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter of number of Employees: ");
		int numberEmployees = sc.nextInt();
		
		for(int i = 0; i < numberEmployees; i++) {
			
			System.out.println("Employ #" + (i+1) + " data: ");
			System.out.println("Outsourced (y/n)");
			char resp = sc.next().charAt(0);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Hour: ");
			int hour = sc.nextInt();
			System.out.println("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			
			switch(resp) {
				case 'y':
					System.out.println("AdditionalCharge: ");
					double additionalCharge = sc.nextDouble();
					Employee empl1 = new OutSourcedEmployee(name, hour, valuePerHour, additionalCharge);
					list.add(empl1);
					break;
				case 'n':
					Employee empl2 = new Employee(name, hour, valuePerHour);
					list.add(empl2);
					break;
				default: System.out.println("Answer is wrong!");
					break;
			}
		}
		
		StringBuilder listEmployee = new StringBuilder();
		listEmployee.append(" Employee: \n");
		for(Employee listElem : list) {
			listEmployee.append(listElem.toString() + "\n");
			listEmployee.append(listElem.payment() + "\n");
		}
		
		System.out.println(listEmployee.toString());
		
		sc.close();
		
	}
	
	public void testeUpcastingAndDowncasting() {
		
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.00, 500.00);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.00, 200.00);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.00, 0.01);
		
		// DOWNCASTING
		
		 // acc2.loan(5); => error: acc2 not have method loan in class Account
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100);

		// error => ClassCastException
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		// Correct downcasting verification
		if( acc3 instanceof BusinessAccount) {
			((BusinessAccount) acc3).loan(100);
			System.out.println("Loan!");
		}
		
		if( acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update balance!");
		}
	}
	
	public void polimorth() {
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println("Comum Account Balance: " + acc1.getBalance());
		
		Account acc2 = new BusinessAccount(1001, "Alex", 1000.0, 500.0);
		acc2.withdraw(200.0);
		System.out.println("Business Account Balance: " + acc2.getBalance());
		
		Account acc3 = new SavingsAccount(1001, "Alex", 1000.0, 0.01);
		acc3.withdraw(200.0);
		System.out.println("Savings Account Balance: " + acc3.getBalance());
		
		// final = class not inheritance, method not to be override and incresead performance as a benefit 
		
	}

}
