package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.ProductFunction;

public class ProgramFunction {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 400.0));
		list.add(new Product("HD Case", 80.90));
		
		Function<Product, String> names4 = name -> name.getName().toUpperCase();
		
		List<String> names = list.stream().map(names4)
								.collect(Collectors.toList());
		
		List<String> names2 = list.stream().map(name -> name.getName().toUpperCase())
				.collect(Collectors.toList());
		
		List<String> names3 = list.stream().map(new ProductFunction())
				.collect(Collectors.toList());

		names2.forEach(System.out::println);
	}

}
