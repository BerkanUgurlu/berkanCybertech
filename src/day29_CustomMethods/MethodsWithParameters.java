package day29_CustomMethods;

import java.util.Scanner;

public class MethodsWithParameters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printHello(5);
        System.out.println("Enter birth year and current year");

        age(scan.nextInt(), scan.nextInt());


    }
    public static void printHello(int NumberOfTimes){
        for (int i = 0; i<NumberOfTimes; i++){
            System.out.println("Hello World");
        }
    }
    public static void age(int birthYear , int currentYear){
        if (currentYear<birthYear){
            //System.exit(0);
            System.out.println("Invalid entry");
        }else{
            int age = currentYear - birthYear;
            System.out.println("You are "+age+" years old");
        }
    }
}
