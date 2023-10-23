package app;

import entities.Product;
import utilities.Triangle;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = new Product();
		product.name = "TV";
		product.price = 1500;
		product.quantity = 15;
		
		System.out.println(product.toString());
		
		product.addProducts(10);
		
		System.out.println(product.toString());
		
		product.removeProducts(5);
		
		System.out.println(product.toString());
	}
	
	public static void trianguloApp() {
		// TODO Auto-generated method stub
		
		Triangle t1 = new Triangle(3, 4, 5);
		
		double areaT1 = t1.area();
		
		Triangle t2 = new Triangle(7.50, 4.50, 4.02);
		
		double areaT2 = t2.area();
		
		System.out.println("Area 1:" + areaT1);
		System.out.println("Area 2:" + areaT2);
	}

}
