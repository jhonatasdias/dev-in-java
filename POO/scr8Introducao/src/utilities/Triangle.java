package utilities;

public class Triangle{
	
	public double a;
	public double b;
	public double c;
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double area() {
		
		double are = Math.sqrt( p() * (p() - this.a) * (p() - this.b) * (p() - this.c) );
		
		return are;
	}
	
	private double p() {
		double p = (this.a + this.b + this.c)/2;
		
		return p;
	}
}
