package application;

import domain.Person;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person(1, "Pedro", "pedro@gmail.com");
        Person p2 = new Person(2, "Lele", "lele@gmail.com");
        Person p3 = new Person(3, "Henrique", "henrique@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}