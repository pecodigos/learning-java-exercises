package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                String[] lineRead = line.split(",");
                list.add(new Product(lineRead[0], Double.parseDouble(lineRead[1])));
                line = br.readLine();
            }

            double average = list.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / list.size();

            System.out.println("Average price: $" + String.format("%.2f", average));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream().filter(p -> p.getPrice() < average)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .toList();

            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
