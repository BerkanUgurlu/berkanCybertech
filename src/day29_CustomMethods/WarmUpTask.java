package day29_CustomMethods;

import java.util.Arrays;

public class WarmUpTask {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10,11,12,13,14};
        combine2Arrays(a1, a2);
        PositiveNegativeOrZero(0);
        System.out.println("========================");
        int[] a3 = {100,-200,200,-300,0,0,900,5000};
        for (int each : a3){
            PositiveNegativeOrZero(each);
        }

    }




    //task3 {1,2,3} {4,5,6} ===> {1,2,3,4,5,6}
    public static void combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+ arr2.length];
        int i =0;
        for (int each : arr1){
            arr3[i] = each;
            i++;
        }
        for (int each : arr2){
            arr3[i] = each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));
    }
    //task4: PositiveNegativeOrZero
    public static void PositiveNegativeOrZero(int num){
        if (num > 0){
            System.out.println(num+" is Positive");
        } else if (num < 0) {
            System.out.println(num+" is Negative");
        }else {
            System.out.println(num+" is Zero");
        }
    }



}
