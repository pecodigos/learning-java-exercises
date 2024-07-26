package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file path: ");
        String sourceFile = sc.nextLine();

        File filePath = new File(sourceFile);
        String fileParent = filePath.getParent();

        boolean success = new File(fileParent + "/out").mkdir();

        String fileDestination = fileParent + "/out/summary.csv";

        List<Product> list = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] lines = line.split(",");
                double price = Double.parseDouble(lines[1]);
                int quantity = Integer.parseInt(lines[2]);

                list.add(new Product(lines[0], price, quantity));
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileDestination))) {
                for (Product prod : list) {
                    bw.write(prod.toString());
                    bw.newLine();
                }
                System.out.printf("File %s was successfully created!\n", fileDestination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
