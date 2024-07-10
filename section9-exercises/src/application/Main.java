package application;

import util.BankAccount;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)?");
        String answer = sc.next();


        while (!answer.equals("y") && !answer.equals("n"))
        {
            System.out.println("Error:\nYou didn't input a valid answer.");
            System.out.print("Is there an initial deposit (y/n)?");
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
            // Making sure no error has occurred.
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