package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enitities.Employee;

public class App {

	public static void main(String[] args) {
		
		int id = 0;
		String name = null;
		double salary = 0;
		
		ArrayList<Employee> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Employee id: ");
			id = sc.nextInt();
			System.out.println("Employ name: ");
			name = sc.next();
			System.out.println("Employ salary: ");
			salary = sc.nextDouble();
			
			Employee emp1 = new Employee(id, name, salary);
			list.add(emp1);
			
			
		} while(id != 0);
		
		System.out.println("Enter the employee id that will have salary increase: ");
		
		
		System.out.println("Enter the percentage: ");
		
		
		
	}
	
	public void boxingAndWrapper() {
		
		// Boxing and unbocing
		// Boxing = transfer value and reference type
		int x = 10;
		
		Object obj = x;
		
		System.out.println(obj);
		
		// Unboxing
		int y = (int) obj;
		
		System.out.println(y);
		
		// Wrapper Classes
		// are classes equivalent to primitive types
		
		// Object => Boolean
		
		int x2 = 20;
		
		Integer obj2 = x2;
		
		System.out.println(obj2);
		
		int y2 = obj2 * 2;
		
		System.out.println(y2);
	}

}
