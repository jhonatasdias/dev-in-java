package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		method1();

	}

	public static void method1() {
		
		System.out.println("***METHOD 1 START***");
		
		method2();
		
		System.out.println("***METHOD 1 END***");
	}
	
	public static void method2() {
		
		System.out.println("***METHOD 2 START***");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] name = sc.nextLine().split(" ");
			int index = sc.nextInt();
			System.out.println(name[index]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
			e.printStackTrace();
		} catch(InputMismatchException t) {
			System.out.println("Input error");
		} finally {
			// example: file closing, database connection,
			// or another specific resource at the end of processing
		}
		
		sc.close();
		System.out.println("***METHOD 2 END***");
	}
}
