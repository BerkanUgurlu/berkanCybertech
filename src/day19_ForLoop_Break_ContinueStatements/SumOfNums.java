package day19_ForLoop_Break_ContinueStatements;

import java.util.Scanner;
/*
7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050

            input: 50
            output: 1275
 */
public class SumOfNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");

        int number = scan.nextInt();
        int sum = 0;

        if (number>1){
          //  System.out.println("Valid number");
            for (int i = 0; i<=number; i++){
               sum += i;
               // sum = sum +i; || Same way.
            }
            System.out.println(sum);
        }else {
            System.out.println("Invalid Number");
        }




    }
}
