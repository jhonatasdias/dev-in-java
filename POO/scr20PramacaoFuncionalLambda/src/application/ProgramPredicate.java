package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class ProgramPredicate {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 400.0));
		list.add(new Product("HD Case", 80.90));
		
		// Implements Predicate
		list.removeIf(new ProductPredicate());
		
		// Reference Method => with static method
		list.removeIf(Product::staticProductPredicate);
		
		// Reference Method => with no static method
		list.removeIf(Product::noStaticProductPredicate);
		
		double min = 100.00;
		Predicate<Product> pred = p -> p.getPrice() > min;
		list.removeIf(pred);
		
		// list.removeIf( p -> p.getPrice() > 100.00 );

		list.forEach(System.out::println);
	}

}
