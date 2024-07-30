package application;

import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many students for course A: ");
        int aNumber = sc.nextInt();

        Set<Student> set = new HashSet<>();

        for (int i = 0; i < aNumber; i++) {

            Integer studentId = sc.nextInt();
            set.add(new Student(studentId));
        }

        System.out.print("Enter how many students for course B: ");
        int bNumber = sc.nextInt();

        for (int i = 0; i < bNumber; i++) {

            Integer studentId = sc.nextInt();
            set.add(new Student(studentId));
        }

        System.out.print("Enter how many students for course C: ");
        int cNumber = sc.nextInt();

        for (int i = 0; i < cNumber; i++) {

            Integer studentId = sc.nextInt();
            set.add(new Student(studentId));
        }

        System.out.println("Total students: " + set.size());

        sc.close();
    }
}
