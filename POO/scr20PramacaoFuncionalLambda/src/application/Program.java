package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;
import util.MyComparator;

public class Program {
	
	public static int compare2(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));

		// anonymous class / functional interface
		Comparator<Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};
		
		// anonymous function => arrow function
		Comparator<Product> comp2 = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		
		// another method
		Comparator<Product> comp3 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort(Program::compare2);
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		list.sort(comp3);
		
		list.sort(comp2);
		
		list.sort(comp);
		
		list.sort(new MyComparator());
		
		for(Product item : list) {
			System.out.println(item.toString());
		}
		list.forEach(System.out::println);
	}

}
