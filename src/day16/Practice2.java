package day16;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word:");
        String word1 = scan.next();

        System.out.println("Enter your second word:");
        String word2 = scan.next();

        String result = word1.equals(word2) ? "words are equal" : "not equal";
        System.out.println(result);



    }
}
