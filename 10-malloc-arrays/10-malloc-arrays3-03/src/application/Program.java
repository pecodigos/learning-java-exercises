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
        sc.nextLine();

        Person[] people = new Person[n];

        double sum = 0.0;
        double sixteenCounter = 0.0;
        for (int i = 0; i < people.length; i++)
        {
            System.out.printf("Person %d data: \n", i + 1);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Height: ");
            double height = sc.nextDouble();
            sc.nextLine();

            people[i] = new Person(name, age, height);

            sum += people[i].getHeight();

            if (people[i].getAge() < 16)
            {
                sixteenCounter++;
            }

        }

        double average = sum / people.length;
        double percentage = (sixteenCounter / people.length) * 100;

        System.out.printf("\nAverage height: %.2f\n", average);
        System.out.println("Percentage of people with less than 16 years old: " + percentage + "%");


        for (Person person : people)
        {
            if (person.getAge() < 16)
            {
                System.out.println(person.getName());
            }
        }


        sc.close();
    }
}
