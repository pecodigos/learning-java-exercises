package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        Map<String, Integer> candidates = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {

                String[] splitLine = line.split(",");
                String name = splitLine[0];
                int votes = Integer.parseInt(splitLine[1]);

                if (candidates.containsKey(name)) {
                    int totalVotes = candidates.get(name);
                    candidates.put(name, totalVotes + votes);
                }
                else {
                    candidates.put(name, votes);
                }
                line = br.readLine();
            }

            for (String key : candidates.keySet()) {
                System.out.println(key + ", " + candidates.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}