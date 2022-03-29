package day21_loops;
import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        String password="1234";
        String username="renastech";

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your username");
        String inputUsername=input.nextLine();

        if (inputUsername.equals(username)){
            int passAttempts = 0;

            while ( passAttempts<3){

                System.out.print("\nEnter Your Password: ");

                String inputPass = input.nextLine();

                if (!(inputPass.equals(password))) {
                    System.out.println("\nWrong Password Try Again");
                    passAttempts++;
                }

                else {
                    System.out.println("\nWelcome!");
                    break;
                }
            }

        }else{
            System.out.println("Username is not found for "+inputUsername );
        }
        System.out.println("Account is Locked");
    }
}
