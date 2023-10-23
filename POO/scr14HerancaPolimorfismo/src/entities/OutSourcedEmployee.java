package entities;

public class OutSourcedEmployee extends Employee {
	
	private Double additionalCharge;

	public OutSourcedEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
		super(name, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		double normalPayment = super.payment();
		return normalPayment + (additionalCharge * 1.1);
	}

	@Override
	public String toString() {
		return super.toString() + " OutSourcedEmployee [additionalCharge=" + additionalCharge + "]";
	}

	
}
