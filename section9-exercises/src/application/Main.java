package application;

import util.BankAccount;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();
        char answer;

        BankAccount bankAccount;

        do
        {
            System.out.print("Is there an initial deposit (y/n)?");
            answer = sc.next().charAt(0);
        }
        while (answer != 'y' && answer != 'n');

        if (answer == 'y')
        {
            System.out.print("Enter initial deposit value: ");
            double firstDeposit = sc.nextDouble();
            bankAccount = new BankAccount(accountNumber, firstDeposit, accountHolder);
        }
        else
        {
            System.out.println();
            bankAccount = new BankAccount(accountNumber,0,accountHolder);
        }

        System.out.println("Account data:");
        System.out.println(bankAccount.accountData());
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        bankAccount.deposit(deposit);
        System.out.println();

        System.out.println("Updated account data: ");
        System.out.println(bankAccount.accountData());
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bankAccount.withdraw(withdraw);
        System.out.println();

        System.out.println("Updated account data: ");
        System.out.println(bankAccount.accountData());

        sc.close();
    }
}