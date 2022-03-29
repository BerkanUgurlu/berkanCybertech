package day29_CustomMethods;
/*
-Age, Citizenship, name.
 */

public class Eligibility {
    public static void main(String[] args) {
        vote("Berkan", 22,true,"Trump");
        vote("Jon",16,true,"Biden");

        eligibleToBuyAlcohol(true, 19);
        calculator(100, '*', 100);

    }
   public static void vote(String name, int age, boolean citizen, String presidentName){
       boolean eligibleToVote = age >=18 && citizen == true;
       if (eligibleToVote){
           System.out.println(name+" is eligible to vote for "+presidentName);
       }else {
           System.out.println(name+" is not eligible to vote");
       }
    }
    public static void eligibleToBuyAlcohol(boolean hasID, int age){
        if (hasID && age >=18){
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("You are eligible to buy milk");
        }
    }
    public static void calculator(double num1, char operator, double num2){

        switch (operator){
            case '+':
                System.out.println("Addition"+(num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction"+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication"+(num1*num2));
                break;
            case '/':
                System.out.println("Division"+(num1/num2));
                break;
            case '%':
                System.out.println("Remainder"+(num1%num2));
                break;
            default:
                System.out.println("Invalid operator");



        }

    }
}
