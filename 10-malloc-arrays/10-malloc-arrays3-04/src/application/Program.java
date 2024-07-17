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
        sc.nextLine();

        Number[] numbers = new Number[n];

        int evenQuantity = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            sc.nextLine();

            numbers[i] = new Number(number);
        }

        System.out.println("\nEven numbers:");

        for (Number number : numbers)
        {
            if (number.getNumber() % 2 == 0)
            {
                System.out.print(number.getNumber() + " ");
                evenQuantity++;
            }
        }

        System.out.print("\n\nEven numbers quantity = " + evenQuantity);

        sc.close();
    }
}
