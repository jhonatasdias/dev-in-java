package model.services.impl;

import model.services.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(Double amount) {
		return amount * 0.02;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		// TODO Auto-generated method stub
		return (Double) amount * months * 0.01;
	}

}
