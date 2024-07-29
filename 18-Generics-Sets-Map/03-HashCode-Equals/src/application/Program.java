package application;

import entities.Client;

public class Program {

    public static void main(String[] args) {

        Client c1 = new Client("Pedro", "pedrinhobakura@gmail.com");
        Client c2 = new Client("Pedro", "pedrinhobakura@gmail.com");

        String s1 = "Test";
        // if instead of literal "Test" as value it had a "new String("Test")" would give false, but in this case it gives true.
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        System.out.println(c1 == c2); // '==' compares memory references (addresses)
        System.out.println(s1 == s2);
    }
}
