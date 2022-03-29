package day33_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate DOB = LocalDate.of(2020,7,24);
        System.out.println(DOB);
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        LocalDate y = LocalDate.of(2020,1,1);
        boolean result = y.isLeapYear();
        System.out.println(result);

        System.out.println("Enter a year");
        int year = scan.nextInt();
        boolean result2 = LocalDate.of(year, 1,1).isLeapYear();
        System.out.println(result2);
        System.out.println("=============================");
        System.out.println("Enter your birth year, month and the day");

        LocalDate year2 = LocalDate.of( scan.nextInt(), scan.nextInt(), scan.nextInt() );
        System.out.println(year2);


    }
}
