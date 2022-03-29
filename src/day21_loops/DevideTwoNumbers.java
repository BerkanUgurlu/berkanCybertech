package day21_loops;

public class DevideTwoNumbers {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        int count = 0;

        if (b == 0){
            System.out.println("Invalid Input");
            System.exit(0);
        }

        while (a >= b){
            a -=b;
            count++;
        }
        System.out.println(count+" with a reminder of "+a);


    }
}
