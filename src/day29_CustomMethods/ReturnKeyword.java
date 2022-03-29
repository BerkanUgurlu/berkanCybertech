package day29_CustomMethods;

public class ReturnKeyword {
    public static void main(String[] args) {
        grade(60);
    }



    public static void grade(int score){
        if (score<0 || score>100){
            System.out.println("Invalid score");
            return;
        }
        char grade = (score >= 90)? 'A' : (score >= 80) ? 'B' : (score >=70)? 'C' : (score>=60)? 'D' :'F';
        System.out.println("Grade is: "+grade);
    }
    public static void eligibleToBuy(int age){
        if (age <= 21){
            System.out.println("You are not eligible");
        }
    }



}


