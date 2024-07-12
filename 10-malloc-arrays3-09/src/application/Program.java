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

        int olderPersonAge = 0;
        String olderPersonName = "";
        for (int i = 0; i < people.length; i++)
        {
            sc.nextLine();

            System.out.printf("Person %d data:\n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            people[i] = new Person(name, age);
            if (people[i].getAge() > olderPersonAge)
            {
                olderPersonAge = people[i].getAge();
                olderPersonName = people[i].getName();
            }
        }

        System.out.println("Older person is " + olderPersonName);

        sc.close();
    }
}
