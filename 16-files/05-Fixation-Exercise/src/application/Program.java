package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file's path: ");
        String filePath = sc.nextLine();

        File file = new File(filePath); // Making the inputted string a new file, to be able to get the file's parent
        String fileParent = file.getParent(); // Getting file parent and storing the value in a string variable

        boolean success = new File(fileParent + "/out").mkdir(); // Making /out directory
        String targetFile = fileParent + "/out/summary.csv"; // storing the target file directory path into a string

        List<Product> list = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) { // Initializing bufferedReader
            String line; // Initializing line so it won't have null value
            while ((line = bufferedReader.readLine()) != null) { // while the value of "bufferedReader.readLine()" isn't null (it's not an empty line) + storing that line in variable line
                String[] lineRead = line.split(","); // making an array of strings and separating it by commas
                double price = Double.parseDouble(lineRead[1]); // converting it to Double before adding it to price
                int quantity = Integer.parseInt(lineRead[2]); // same for quantity

                list.add(new Product(lineRead[0], price, quantity)); // Adding the product in list
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile))) { // Initializing bufferedWriter
                for (Product product : list) { // Looping for each product in list
                    bufferedWriter.write(product.toString()); // Writing the product (converted to String) in new file
                    bufferedWriter.newLine(); // Appending \n
                }
                System.out.printf("NEW FILE IN %s WAS CREATED SUCCESSFULLY!\n", targetFile); // Making sure new file was created successfully
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sc.close();
    }
}
