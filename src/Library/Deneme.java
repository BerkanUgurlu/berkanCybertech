package Library;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String name = scan.next();
        String name2 = scan.nextLine();

        System.out.println(name2);

        String str = "Hello";
        String str1 = new String("Hello");
        if (str.equals(str1)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
