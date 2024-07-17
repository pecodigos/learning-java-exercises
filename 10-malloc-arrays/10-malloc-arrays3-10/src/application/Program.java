package application;

import entities.Student;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];


        for (int i = 0; i < students.length; i++)
        {
            sc.nextLine();

            System.out.printf("Enter the name, first and second grade of student %d:\n", i + 1);
            String name = sc.nextLine();
            double firstGrade = sc.nextDouble();
            double secondGrade = sc.nextDouble();

            students[i] = new Student(name, firstGrade, secondGrade);
        }
        double averageGrade = 0.0;

        System.out.println("Approved students:");

        for (Student student : students)
        {
            averageGrade = (student.getFirstGrade() + student.getSecondGrade()) / 2;
            if (averageGrade >= 6)
            {
                System.out.println(student.getName());
            }
        }
        sc.close();
    }
}
