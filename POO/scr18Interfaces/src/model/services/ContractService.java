package model.services;

import java.time.LocalDate;
import java.util.List;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService paymentService;

	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, Integer months) {
		

		double basicQuota = (double) contract.getTotalValue() / months;
		
		List<Installment> list = contract.getInstallments();
		
		for(int i = 1; i <= months; i++) {
			
			double interes = paymentService.interest(basicQuota, i);
			double fee = paymentService.paymentFee(basicQuota + interes);
			
			double tax = interes + fee;
			
			double quota = basicQuota + tax;
			
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			list.add(new Installment(dueDate, quota));
			
		}
	
	}
	
}
