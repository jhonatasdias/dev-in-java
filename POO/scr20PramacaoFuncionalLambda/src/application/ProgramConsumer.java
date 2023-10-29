package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.ProductConsumer;

public class ProgramConsumer {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 400.0));
		list.add(new Product("HD Case", 80.90));
		
		//list.forEach(  p -> p.setPrice(p.getPrice() * 1.1) ) ;
		
		list.forEach(new ProductConsumer());
		
		list.forEach(System.out::println);
	}
}
