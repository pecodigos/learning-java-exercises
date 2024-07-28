package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

    public static void main(String[] args) {

        ConcretePrinter concretePrinter = new ConcretePrinter("1800");
        concretePrinter.processDoc("My letter");
        concretePrinter.print("My letter\n");

        ConcreteScanner concreteScanner = new ConcreteScanner("1998");
        concreteScanner.processDoc("My email");
        System.out.println("Scan result: " + concreteScanner.scan());

        System.out.println();

        ComboDevice comboDevice = new ComboDevice("2002");
        comboDevice.processDoc("My stuff...");
        comboDevice.print("My stuff...");
        System.out.println("Scan result: " + comboDevice.scan());



    }
}
