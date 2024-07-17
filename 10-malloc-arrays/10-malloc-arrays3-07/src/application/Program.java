package application;

import entities.Vector;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many elements the array will have: ");
        int n = sc.nextInt();

        Vector[] vectors = new Vector[n];

        double vectorSum = 0.0;
        for (int i = 0; i < vectors.length; i++)
        {
            sc.nextLine();
            System.out.print("Enter a number: ");
            double number = sc.nextDouble();

            vectors[i] = new Vector(number);

            vectorSum += vectors[i].getNumber();
        }

        double vectorAverage = vectorSum / vectors.length;
        System.out.printf("\nVector average value = %.3f\n", vectorAverage);

        System.out.println("Values that are below average:");

        for (Vector vector : vectors)
        {
            if (vector.getNumber() < vectorAverage)
            {
                System.out.println(vector.getNumber());
            }
        }

        sc.close();
    }
}
