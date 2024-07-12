package application;

import entities.Number;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how much numbers: ");
        int n = sc.nextInt();

        Number[] numbers = new Number[n];

        double greaterNumber = 0;
        int greaterNumberPosition = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            sc.nextLine();
            System.out.print("Enter a number: ");
            double number = sc.nextDouble();

            numbers[i] = new Number(number);

            if (numbers[i].getNumber() > greaterNumber)
            {
                greaterNumberPosition = i;
                greaterNumber = numbers[i].getNumber();
            }
        }

        System.out.println("\nGreater number value = " + greaterNumber);
        System.out.println("Greater number position = " + greaterNumberPosition);
        sc.close();
    }
}
