package application;

import entities.Number;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = 11; // Making a loop possible

        while (n > 10)
        {
            System.out.print("Enter how many numbers do you want: ");
            n = sc.nextInt();
        }
        sc.nextLine(); // Consuming nextInt

        Number[] number = new Number[n];

        for (int i = 0; i < number.length; i++)
        {
            System.out.print("Enter a number: ");
            int userNumber = sc.nextInt();
            number[i] = new Number(userNumber);
        }

        System.out.println("Negative numbers: ");

        for (Number value : number)
        {
            if (value.getNumber() < 0)
            {
                System.out.println(value.getNumber());
            }
        }
       sc.close();
    }
}