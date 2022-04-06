package day16;

import java.util.Scanner;

public class Practice_Math {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First Number:");
        double num1 = scan.nextDouble();
        System.out.println("Second number");
        double num2 = scan.nextDouble();
        System.out.println("Enter your math operator");
        char operator = scan.next().charAt(0);

        boolean valid = operator == '*' || operator == '/' || operator == '%' || operator == '+' || operator == '-';

        if (valid){
            switch (operator){
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case '%':
                    System.out.println(num1%num2);
                    break;
                case '+':
                    System.out.println(num1+num2);
                    break;
                default:
                    System.out.println(num1-num2);
            }

        }else{
            System.out.println("Invalid operator");
        }


    }
}
