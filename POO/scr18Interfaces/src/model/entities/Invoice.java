package model.entities;

public class Invoice {

	private Double basicPayment;
	private Double tax; // tax = amount * rate(brazil rate) => service

	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	};
	
	public Double TotalPayment() {
		return getBasicPayment() + getTax();
	}

	@Override
	public String toString() {
		return "Invoice [basicPayment=" + basicPayment + ", tax=" + tax + "]";
	}
	
}
