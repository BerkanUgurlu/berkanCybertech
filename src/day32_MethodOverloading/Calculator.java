package day32_MethodOverloading;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scan.nextDouble();
        System.out.println("Operator: ");
        char oper = scan.next().charAt(0);
        System.out.println("Enter your second number");
        double num2 = scan.nextDouble();
        double result = calculator(num1, oper, num2);
        System.out.println(result);
    }

    public static double calculator(double num1, char oper, double num2){
        double result = (oper == '+') ? num1+num2 : (oper == '-') ? num1-num2 : (oper == '*') ? num1*num2 :
                (oper == '/') ? num1/num2 : (oper == '%') ? num1%num2 : 0;
        return result;
    }
}
