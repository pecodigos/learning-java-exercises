package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program
{
    public static void main(String[] args)
    {
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2024-07-10");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-10T01:30:26");
        Instant d06 = Instant.parse("2024-07-10T01:30:26Z");
        Instant d07 = Instant.parse("2024-07-10T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("10/07/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("10/07/2024 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println("D01: " + d01);
        System.out.println("D02: " + d02);
        System.out.println("D03: " + d03);
        System.out.println("D04: " + d04);
        System.out.println("D05: " + d05);
        System.out.println("D06: " + d06);
        System.out.println("D07: " + d07);
        System.out.println("D08: " + d08);
        System.out.println("D09: " + d09);
        System.out.println("D10: " + d10);
        System.out.println("D11: " + d11);
    }
}
