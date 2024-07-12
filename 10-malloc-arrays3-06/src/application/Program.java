package application;

import entities.Vector;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how much values each vector will have: ");
        int n = sc.nextInt();

        Vector[] vectorA = new Vector[n];

        System.out.println("Enter the values of Vector A:");
        for (int i = 0; i < vectorA.length; i++)
        {
            sc.nextLine();
            int vectorValueA = sc.nextInt();

            vectorA[i] = new Vector(vectorValueA);
        }

        Vector[] vectorB = new Vector[n];

        System.out.println("Enter the values of Vector B: ");
        for (int i = 0; i < vectorB.length; i++)
        {
            sc.nextLine();
            int vectorValueB = sc.nextInt();

            vectorB[i] = new Vector(vectorValueB);
        }

        Vector[] vectorC = new Vector[n];

        System.out.println("Result vector: ");
        for (int i = 0; i < vectorC.length; i++)
        {
            int vectorValueC = vectorA[i].getNumber() + vectorB[i].getNumber();
            vectorC[i] = new Vector(vectorValueC);
            System.out.println(vectorC[i].getNumber());
        }

        sc.close();
    }
}
