package day21_loops;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      String truePassword = "berkan123";
      String trueUserName = "berkan";

        for (int i = 1; i <= 3; i++){
            System.out.println("Enter your Username: ");
            String userName = scan.next();
            System.out.println("Enter your Password: ");
            String passWord = scan.next();
        if (userName.equals(trueUserName) && passWord.equals(truePassword)){
            System.out.println("Logged in");
            //break;
        } else if (userName != trueUserName && passWord != truePassword) {
           continue;
        }
        System.out.println("Your account is locked");
        //System.exit(0);
        }
       System.exit(0);
        System.out.println("Your account is locked");



    }
}
