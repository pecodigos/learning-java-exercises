package application;

import entities.Number;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consuming nextInt

        Number[] numbers = new Number[n];

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print("Enter a number: ");
            double number = sc.nextDouble();
            numbers[i] = new Number(number);
        }

        double sum = 0.0;

        System.out.print("Values = ");
        for (Number value : numbers)
        {
            System.out.print(value.getNumber() + " ");
            sum += value.getNumber();
        }

        double average = sum / numbers.length;

        System.out.printf("\nSum = %.2f\n", sum);
        System.out.printf("Average = %.2f\n", average);

        sc.close();
    }
}
