package application;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people do you want to calculate the heights for: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        double sum = 0.0;
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter the person's height: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double average = sum / n;

        System.out.printf("The average height for the %d people is %2.2f.", n, average);

        sc.close();
    }
}
