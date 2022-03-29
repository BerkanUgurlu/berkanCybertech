package day32_MethodOverloading;

import java.util.Locale;
import java.util.Scanner;

//formatFullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
public class formatFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.next();
        String lastName = scan.next();
        /*
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        */
        String fullName = formatFullName(first, lastName);
        System.out.println(fullName);

    }
    public static String formatFullName(String first, String lastName){
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        String fullName = first + " " + lastName;
        return fullName;
    }
}
