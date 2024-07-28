package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rectangle width: ");
        double width = sc.nextDouble();

        System.out.print("Enter rectangle height: ");
        double height = sc.nextDouble();

        System.out.print("Enter rectangle color (black or white): ");
        Color rectangleColor = Color.valueOf(sc.next().toUpperCase());

        System.out.print("\nEnter the circle radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter circle color (black or white): ");
        Color circleColor = Color.valueOf(sc.next().toUpperCase());

        AbstractShape as1 = new Rectangle(rectangleColor, width, height);
        AbstractShape as2 = new Circle(circleColor, radius);



        System.out.println("\nRectangle and Circle information:");
        System.out.println("\n-----------------------------------");

        System.out.println("\nRectangle:\nAREA: " + String.format("%.2fcm", as1.area()));
        System.out.println("COLOR: " + as1.getColor());
        System.out.println("\nCircle:\nAREA: " + String.format("%.3fcm", as2.area()));
        System.out.println("COLOR: " + as2.getColor());



        sc.close();
    }
}
