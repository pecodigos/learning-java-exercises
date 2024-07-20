package application;

import entities.Company;
import entities.Individual;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            System.out.printf("\nTax payer #%d data:\n", i + 1);
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double income = sc.nextDouble();

            if (ch == 'i')
            {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, income, healthExpenditures));
            }
            else
            {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, income, numberOfEmployees));
            }
        }

        System.out.println("\nTAXES PAID:");

        double sum = 0.0;
        for (Person person : list)
        {
            System.out.println(person.getName() + ": $" + String.format("%.2f", person.taxesPayed()));
            sum += person.taxesPayed();
        }

        System.out.printf("\nTOTAL TAXES: $%.2f\n", sum);

        sc.close();
    }
}
