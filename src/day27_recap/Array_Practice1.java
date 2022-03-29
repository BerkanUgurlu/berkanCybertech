package day27_recap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {
    public static void main(String[] args) {
        String[] names = {"Aalia", "Nurbiye", "Ayse"};
        // index:            0          1        2
        System.out.println("============");
        for (int i = 0; i<=names.length-1; i++){
           // if (names[i].charAt(0) != 'A')
            if ( !names[i].startsWith("A" ))
                continue;
            System.out.println(names[i]);
        }
        System.out.println("============");
        int[] number = new int[5];
        number[3] = 25;
        number[0] = 100;
        number[3] = 300;
        System.out.println(Arrays.toString(number));
        System.out.println("==========");
        Scanner scan = new Scanner(System.in);
        String[] students = new String[5];
        //System.out.println("Enter a name");
        //students[0] = scan.nextLine(); // "Muhtar"
        //System.out.println(Arrays.toString(students));

        for (int i = 0; i<5; i++){
            System.out.println("Enter a name");
            students[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(students));



    }
}
