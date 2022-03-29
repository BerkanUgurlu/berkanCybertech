package day26_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {

        char[] ch1 = {'A', 'B'};
        char[] ch2 = {'C', 'D'};
        char[] ch3 = {'F', 'G', 'H'};

        //                  0    1      0    1    2      0    1    2
        char[][] ch2D = { {'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'} }; // ch1, ch2, ch3
        //                     0           1             2          index numbers.
        //System.out.println(Arrays.toString(ch2D[1]));
        //System.out.println(Arrays.toString(ch2D[2]));
        System.out.println(ch2D[2][2]); // H
        System.out.println(ch2D[1][0]); // C
        System.out.println(ch2D[2][1]); // G

        int [][] nums = { {1,2,3}, {4}, {5,6}, {7,8,9,10}, };
        System.out.println(Arrays.toString(nums[3]));

        for (int i = 0; i <= nums.length-1; i++){
           //ystem.out.println(Arrays.toString(nums[i]));

        }
        System.out.println(Arrays.deepToString(nums));

        System.out.println("=================");

        String[] testers = {"liliia", "Odina", "Cristina", "Elkem" };
        String[] developers = {"Ahmet", "Erfan", "Roza", "Sarah"};
        String[] SM = {"Nurmamet"};
        String[] PO = {"Nadir"};
        String[] BA = {"Alex"};

        String[] testers2 = {"Irene", "Aslan", "Nazar"};
        String[][] scrumTeam = {testers, developers, SM, PO, BA};
        //                         0         1        2   3   4
        System.out.println(Arrays.deepToString(scrumTeam));
        scrumTeam[4][0] = "Adam";
        scrumTeam[1][2] = "Emine";
        scrumTeam[0] = testers2;
        scrumTeam[3][0] = "Zeki";
        System.out.println(Arrays.deepToString(scrumTeam));
        System.out.println("============");
        for (String[] each : scrumTeam ){
            for (String name : each){
                System.out.println(name);
            }
        }
        System.out.println("=====================");
        int[][] scores = { {10,20,30,45}, {60, 55, 75, 105}, {93, 48, 125, 135, 13} };
        for (int[] each : scores){
            for (int num : each){
                if (num%3==0 || num%5==0){
                    System.out.print(num+" ");
                }
            }
        }



    }
}
