package day21_loops;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 9999999;
        for (int i = 1; i <=5; i++){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if (num < min){
                min = num;
            }
        }
        System.out.println("min number: "+min);
    }

}
