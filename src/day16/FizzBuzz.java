package day16;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word:");
        String word1 = scan.next();
        System.out.println("Enter your second word:");
        String word2 = scan.next();

        boolean result = word1.length() == 5 && word2.length() ==5;
        /*
        if (result){
            char ch1 = word1.charAt(word1.length() -1 );
            char ch2 = word2.charAt(0);
            if (ch1 == ch2){
                System.out.println("Fizz");
            }else {
                System.out.println("Buzz");
            }
        }else {
            System.out.println("need to be exactly 5 chars length");
        }
*/

























    }
}
