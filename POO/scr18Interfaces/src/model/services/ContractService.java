package model.services;

import java.time.LocalDateTime;
import java.util.List;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService paymentService;

	public void processContract(Contract contract, Integer months) {
		
		double valuePerMonth = contract.getTotalValue() / months;
		
		List<Installment> list = contract.getInstallments();
		
		for(int i = 0; i < months; i++) {
			double interes = paymentService.interest(valuePerMonth, i);
			double free = paymentService.paymentFee(valuePerMonth);
			
			double tax = interes + free;
			
			LocalDateTime dueDate = contract.getDate().plusDays(30);
			
			list.add(new Installment(dueDate, tax ));
			
		}
	
	}
	
}
