package application;

import entities.Number;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many elements the array will have: ");
        int n = sc.nextInt();

        Number[] numbers = new Number[n];

        double sum = 0.0;
        double countingEven = 0.0;
        for (int i = 0; i < numbers.length; i++)
        {
            sc.nextLine();
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            numbers[i] = new Number(number);

            if (numbers[i].getNumber() % 2 == 0)
            {
                sum += numbers[i].getNumber();
                countingEven++;
            }
        }

        double averageEven = sum / countingEven;

        if (sum != 0)
        {
            System.out.println("Even numbers average = " + averageEven);
        }
        else
        {
            System.out.println("No even number");
        }

        sc.close();
    }
}
