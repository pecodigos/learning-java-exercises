package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();  // Initializing new ArrayList

        // Adding names to it
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        // Adding Marco to index 2
        list.add(2, "Marco");

        System.out.println(list.size()); // print size of list

        for (String value : list)
        {
            System.out.println(value);
        }

        System.out.println("------------------------");
        list.removeIf(value -> value.charAt(0) == 'M'); // lambda expression to remove each string that starts with the letter M

        for (String value : list)
        {
            System.out.println(value);
        }

        System.out.println("------------------------");

        // Index of function
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("------------------------");

        List<String> result = list.stream().filter(value -> value.charAt(0) == 'A').toList(); // lambda to filter (print only) the strings that starts with letter A

        for (String value : result)
        {
            System.out.println(value);
        }

        System.out.println("------------------------");

        String name = list.stream().filter(value -> value.charAt(0) == 'J').findFirst().orElse(null); // Find the first string that starts with certain letter, if there isn't one, return null
        System.out.println(name);

    }
}
