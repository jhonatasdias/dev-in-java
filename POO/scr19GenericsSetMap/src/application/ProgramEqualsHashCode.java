package application;

import entities.Client;

public class ProgramEqualsHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client c1 = new Client("Maria", "maria@email.com");
		Client c2 = new Client("Maria", "maria@email.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");
		String s4 = new String("Test");
		
		System.out.println(c1 == c2);
		System.out.println("---------------------------------------------");
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
	}
	
	public static void equalsHash() {
		
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.equals(b));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}

}
