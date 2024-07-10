package application;

import entities.BankAccount;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Initializing account for possible first deposit and print message
        BankAccount account = new BankAccount();

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        // Input 'y' or 'n'
        account.printMessage();
        String answer = sc.next();

        // Loop if the user didn't input the valid answer
        while (!answer.equals("y") && !answer.equals("n"))
        {
            System.out.println("Error:\nYou didn't input a valid answer.");
            account.printMessage();
            answer = sc.next();
        }

        if (answer.equals("y"))
        {
            System.out.print("Enter initial deposit value: ");
            double firstDeposit = sc.nextDouble();
            account.deposit(firstDeposit);
        }
        else
        {
            // Making sure to capture unknown error.
            System.out.println("Unknown error has occurred.");
        }

        BankAccount bankAccount = new BankAccount(accountNumber, accountHolder, account.getAccountBalance());

        System.out.println("\nAccount data:");
        System.out.println(bankAccount.accountData());

        System.out.print("\nEnter a deposit value: ");
        double deposit = sc.nextDouble();
        bankAccount.deposit(deposit);

        System.out.println("\nUpdated account data: ");
        System.out.println(bankAccount.accountData());

        System.out.print("\nEnter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bankAccount.withdraw(withdraw);

        System.out.println("\nUpdated account data: ");
        System.out.println(bankAccount.accountData());

        sc.close();
    }
}