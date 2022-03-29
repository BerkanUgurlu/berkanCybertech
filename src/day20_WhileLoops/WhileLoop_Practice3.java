package day20_WhileLoops;
import java.util.Scanner;
public class WhileLoop_Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "Cybertek123";
        System.out.println("Enter your password: ");
        String input = scanner.nextLine();
        while (!input.equals(password)){
            System.out.println("Please re-enter your password");
            input = scanner.nextLine();
        }
        System.out.println("logged in");


    }




}
