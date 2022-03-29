package day22_NestedLoop;

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String word= scan.next();
        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length()-1);

        boolean strt = ch1 >= 'A' && ch1 <= 'Z';
        boolean and = ch2 >= 'a' && ch2 <= 'z';

        if (strt && and){
            System.out.println("True");
        }else {
            System.out.println("False");
        }





    }
}
