package application;

import entities.Product;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many products: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];


        double sum = 0.0;
        for (int i = 0; i < vect.length; i++)
        {
            sc.nextLine();
            System.out.print("Name of the product: ");
            String name = sc.nextLine();
            System.out.print("Its price: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            sum += vect[i].getPrice();
        }

        double average = sum / vect.length;

        System.out.printf("Average price is $ %.2f.", average);

        sc.close();
    }
}