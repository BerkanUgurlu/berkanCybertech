package day19_ForLoop_Break_ContinueStatements;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scan.next();
        System.out.println("Enter your last name: ");
        String lastName = scan.next();
        String trueName = "Berkan";
        String trueLast = "Ugurlu";
        String fullName = firstName +" "+ lastName;
        boolean result = firstName.equalsIgnoreCase(trueName) && lastName.equalsIgnoreCase(trueLast);
        if (result){
            for (int i = 0; i<5; i++ ){
                System.out.println("True! Your full name is: "+fullName);
            }
        }else {
            for (int i = 0; i<5; i++){
                System.out.println("False");
            }

        }


    }
}
