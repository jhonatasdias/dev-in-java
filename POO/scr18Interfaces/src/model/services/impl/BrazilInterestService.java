package model.services.impl;

import model.services.InterestService;

public class BrazilInterestService implements InterestService {

	private double interestRate;

	public BrazilInterestService(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
