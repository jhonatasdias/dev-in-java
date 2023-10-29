package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class ProgramSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
														// if dont have equal and hashcode compare with pointer
		Product prod = new Product("Notebook", 1200.0); // compare if exist with content
		
		System.out.println(set.contains(prod));
	}

	
	public static void testSet() {
		
		Set<String> setHash = new HashSet<>(); // dont have order
		Set<String> setTree = new TreeSet<>(); // order name
		Set<String> setLinkedHash = new LinkedHashSet<>(); // order insertion
		
		setHash.add("TV");
		setHash.add("Tablet");
		setHash.add("Notebook");
		
		setHash.removeIf( element -> element.charAt(0) == 'T' );
		
		
		System.out.println(setHash.contains("Notebook"));
		
		for(String item : setHash) {
			System.out.println(item);
		}
		
		
	}
}
