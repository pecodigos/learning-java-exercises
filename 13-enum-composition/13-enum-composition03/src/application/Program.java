package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);

        // Formatting birthday date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();

        System.out.print("Email: ");
        String clientEmail = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next()); // Since birthday date doesn't have spaces, sc.next

        Client client = new Client(clientName, clientEmail, birthDate); // Initializing new client

        System.out.println("\nEnter order data:");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next()); // Don't forget valueOf() method

        Order order = new Order(new Date(), orderStatus, client); // Initializing order before the loop

        System.out.print("\nEnter how many items to this order: ");
        int itemQuantity = sc.nextInt();

        for (int i = 0; i < itemQuantity; i++)
        {
            sc.nextLine(); // consuming line break

            System.out.printf("\nEnter #%d item data:\n", i + 1);
            System.out.print("Product name: ");
            String name = sc.nextLine();

            System.out.print("Product price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, price, new Product(name, price)); // Initializing new order item to add it to an Order
            order.addItem(orderItem);
        }

        System.out.println(order);
        sc.close();
    }
}
