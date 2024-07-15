package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many employees will be registered: ");
        int n = sc.nextInt();

        // Check if the user didn't input a value greater than 0
        while (n <= 0)
        {
            sc.nextLine();
            System.out.print("Error #01\nPlease enter a value equal or higher than 1: ");
            n = sc.nextInt();
        }

        // Initializing a new Array List
        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            sc.nextLine();
            System.out.printf("\nEmployee #%d:", i + 1);

            System.out.print("\nId: ");
            int id = sc.nextInt();
            while (findId(list, id))
            {
                System.out.print("This ID has already been registered. Please enter another: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary)); // Adding the new object to the ArrayList list
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        // Lambda expression. For x, if id in x is equal to the typed id, find it, or else return null.
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (employee == null)
        {
            System.out.println("This id doesn't exist!");
        }
        else
        {
            System.out.print("Enter the percentage you want to increase the salary: ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        }

        System.out.println("\nList of employees:");

        for (Employee obj : list)
        {
            System.out.println(obj);
        }
        sc.close();
    }

    // Function to know if there's already, or not, the same registered id
    public static boolean findId(List<Employee> list, int id)
    {
        // Lambda expression, the same for getting the ID for the salary.
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}
