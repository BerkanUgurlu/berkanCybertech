package day23_Arrays;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
            while (true) {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter two numbers");
                double num1 = input.nextDouble();
                double num2 = input.nextDouble();
                System.out.println("Enter the math operator");
                char o = input.next().charAt(0);
                double result = (o == '+') ? num1+num2 :( o == '-')? num1-num2 :( o == '*')? num1*num2
                        :( o == '/')? num1/num2 :(o == '%')? num1%num2 : 0;
                switch (o){
                    case '+':
                        System.out.println(num1+num2);
                        break;
                    case '-':
                        System.out.println(num1-num2);
                        break;
                    case '*':
                        System.out.println(num1*num2);
                        break;
                    case '/':
                        System.out.println(num1/num2);
                        break;
                    case '%':
                        System.out.println(num1%num2);
                        break;
                    default:
                        System.out.println("Invalid operator");
                }

                //System.out.println("Result: " + result);
                System.out.println("Do you want to continue");
                String a = input.next().toLowerCase();

                while (!(a.equals("yes") || a.equals("no"))) {
                    System.out.println("Invalid Answer, please enter yes or no");
                    System.out.println("Do you want to continue");
                    a = input.next().toLowerCase();
                }

                if (a.equals("no")) {
                    break;
                }

            }


        }

}
