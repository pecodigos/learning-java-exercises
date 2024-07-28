package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract data...");

        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);

        System.out.print("Contract value: ");
        double contractValue = sc.nextDouble();

        System.out.print("Enter number of installments: ");
        int numberOfInstallment = sc.nextInt();

        Contract contract = new Contract(number, date, contractValue);

        ContractService service = new ContractService(new PaypalService());

        service.processContract(contract, numberOfInstallment);

        System.out.println("Installments: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
