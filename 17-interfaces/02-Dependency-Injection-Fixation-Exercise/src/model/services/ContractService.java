package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;


public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {

        double installmentValue = contract.getTotalValue() / months;

        for (int i = 0; i < months; i++) {

            LocalDate dueDate = contract.getDate().plusMonths(i + 1);
            double interest = onlinePaymentService.interest(installmentValue, i + 1);
            double fee = onlinePaymentService.paymentFee(installmentValue + interest);
            double total = installmentValue + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, total));
        }
    }
}
