package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data:");
        System.out.print("Number: ");
        int number = sc.nextInt();

        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();

        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        System.out.print("\nEnter amount for withdraw: ");
        double withdraw = sc.nextDouble();

        Account account = new Account(number, holder, initialBalance, withdrawLimit);

        try {
            account.withdraw(withdraw);

            System.out.println("New balance: " + account.getBalance());
        }
        catch (DomainException e) {
            System.out.println("\nWithdraw error:\n" + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("\nUnexpected error :(");
        }
        sc.close();
    }
}
