package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	// default constructor 
	public Product() {};
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name =  name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		if(price > 0)
			this.price = price;
	}
	
	public double totalValueInStock() {		
		return this.price * this.quantity;
	}
	
	public void addProducts(int quantity) {
		if(quantity > 0)
			this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		if(quantity > 0)
			this.quantity -= quantity;
	}
	
	@Override
	public String toString() {
		return "Produto: " + name + 
				" price: "+ String.format("%.2f", this.price) + 
				" quantity: " + quantity + 
				" Total: " + String.format("%.2f", totalValueInStock());
		
	}
}
