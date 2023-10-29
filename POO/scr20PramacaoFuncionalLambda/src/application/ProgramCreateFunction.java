package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.ProductService;

public class ProgramCreateFunction {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 400.0));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double total = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println(total);

	}

}
