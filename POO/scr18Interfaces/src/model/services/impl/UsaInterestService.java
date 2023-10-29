package model.services.impl;

import model.services.InterestService;

public class UsaInterestService implements InterestService {

	private double interestRate;

	public UsaInterestService(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
}
