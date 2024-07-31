package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            List<Employee> list = new ArrayList<>();

            while (line != null) {
                String[] lineRead = line.split(",");
                list.add(new Employee(lineRead[0], lineRead[1], Double.parseDouble(lineRead[2])));

                line = br.readLine();
            }

            List<String> salaryStream = list.stream()
                    .filter(x -> x.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted().toList();

            System.out.printf("\nEmail of people whose salary is more than $%.2f:\n", salary);

            salaryStream.forEach(System.out::println);

            double salarySum = list.stream().filter(x -> x.getName().charAt(0) == 'M').map(Employee::getSalary).reduce(0.0, Double::sum);

            System.out.printf("\nSalary summation of people whose name starts with 'M': $%.2f", salarySum);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
