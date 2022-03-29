package day18_ForLoop;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
   /*
   1. write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18

                output:
                    your initial is: CB

        DO NOT use charAt method
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.next(); ;
        System.out.println("Enter your last name: ");
        String lastName = scan.next(); ;

        String initial = firstName.substring(0,1)+ "." + lastName.substring(0,1);
        initial = initial.toUpperCase(Locale.ROOT);
        System.out.println(initial);




    }
}
