package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;

	public BusinessAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit)
			deposit(amount);
	}
	
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);
		double rate = 2;
		balance -= rate;
	}
	
}
