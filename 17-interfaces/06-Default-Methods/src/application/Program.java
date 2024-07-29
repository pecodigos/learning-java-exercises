package application;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter number of months: ");
        int months = sc.nextInt();

        InterestService interestService = new UsaInterestService(2.0);
        double payment = interestService.payment(amount, months);

        System.out.printf("\nPayment after %d months:\n", months);
        System.out.printf("%.2f%n", payment);

        sc.close();
    }
}
