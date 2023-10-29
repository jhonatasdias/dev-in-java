package model.services.impl;

import model.services.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {

	@Override
	public double paymentFee(double amount) {
		return amount * 0.02;
	}

	@Override
	public double interest(double amount, Integer months) {
		// TODO Auto-generated method stub
		return (Double) amount * months * 0.01;
	}

}
