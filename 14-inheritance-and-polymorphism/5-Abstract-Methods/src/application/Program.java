package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            System.out.printf("\nShape #%d data:\n", i + 1);
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r')
            {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                list.add(new Rectangle(color, height, width));
            }
            else
            {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                list.add(new Circle(color, radius));
            }
        }

        System.out.println("\nSHAPE OF AREAS:");

        for (Shape shape : list)
        {
            System.out.printf("%.2f\n", shape.area());
        }
        sc.close();
    }
}
