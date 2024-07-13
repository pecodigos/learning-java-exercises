package application;

import entities.Room;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = -1;
        while (n > 10 || n <= 0)
        {
            System.out.print("Enter how many rooms will be rented (max 10): ");
            n = sc.nextInt();
            sc.nextLine();
        }

        String[] personName = new String[n];
        String[] personEmail = new String[n];
        Room[] rooms = new Room[10];

        for (int i = 0; i < n; i++)
        {
            System.out.printf("Rent #%d:\n", i + 1);
            System.out.print("Name: ");
            personName[i] = sc.nextLine();

            System.out.print("Email: ");
            personEmail[i] = sc.nextLine();

            int room = -1;
            System.out.print("Room: ");
            while (room > 9 || room < 0)
            {
                room = sc.nextInt();
                sc.nextLine();
            }
            rooms[room] = new Room(personName[i], personEmail[i], room);
        }

        System.out.println("\nBusy rooms:");

        for (Room value : rooms)
        {
            if (value != null)
            {
                System.out.printf("%d: %s, %s\n", value.getRoom(), value.getName(), value.getEmail());
            }
        }

        sc.close();
    }
}
