package application;

import entities.Person;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many people: ");
        int n = sc.nextInt();

        Person[] people = new Person[n];

        double lesserHeight = 100.0;
        double greaterHeight = 0.0;
        double femaleCounting = 0.0;
        double femaleHeightSum = 0.0;
        int maleCounting = 0;

        for (int i = 0; i < people.length; i++)
        {
            sc.nextLine();

            System.out.printf("Person %d height: ", i + 1);
            double height = sc.nextDouble();

            System.out.printf("Person %d gender: ", i + 1);
            char gender = sc.next().charAt(0);

            people[i] = new Person(height, gender);

            if (people[i].getHeight() < lesserHeight)
            {
                lesserHeight = people[i].getHeight();
            }
            if (people[i].getHeight() > greaterHeight)
            {
                greaterHeight = people[i].getHeight();
            }
            if (people[i].getGender() == 'F')
            {
                femaleHeightSum += people[i].getHeight();
                femaleCounting++;
            }
            if (people[i].getGender() == 'M')
            {
                maleCounting++;
            }
        }

        double averageFemaleHeight = femaleHeightSum / femaleCounting;

        System.out.println("Shorter person height = " + lesserHeight);
        System.out.println("Taller person height = " + greaterHeight);
        System.out.printf("Average female height = %.2f\n", averageFemaleHeight);
        System.out.println("Number of males = " + maleCounting);

        sc.close();
    }
}
