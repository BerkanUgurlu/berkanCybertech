package day23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String months [] = {"Jan", "Feb", "March", "Apr", "May", "Jun", "July", "Agust", "Sep", "Oct", "Nov", "Dec"};
        System.out.println("Enter a number between 1 to 12");
        int number = scan.nextInt();
        System.out.println(months[number-1]);



    }
}
