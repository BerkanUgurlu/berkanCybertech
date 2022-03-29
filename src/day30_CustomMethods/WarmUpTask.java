package day30_CustomMethods;

import java.util.Arrays;

public class WarmUpTask {
    public static void main(String[] args) {
        maxMun(10,20);
        int arr[] = {5,2,3,4,5,6,7,0,-5,-54,-55,-45,-45};
        printDesc(arr);
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10,11,12,13,14};
        combine2Arrays(a1,a2);
        PosNegZero(0);
        System.out.println("======================");
        int[] a3 = {100, -200, -300, 0, 0, 900, 5000};
        for (int each : a3){
            PosNegZero(each);
        }

    }

    // task1
    public static void maxMun(int a, int b){
        if (a==b){
            System.out.println("Equal");
            return;
        }
        if (a>=b){
            System.out.println(a+" is maximum");
        }else {
            System.out.println(b+" is maximum");
        }
    }
   // task2
    public static void printDesc(int[] arr){
        Arrays.sort(arr); // { 5, 6, 7 ,9, 10, 20, 30}
        for (int i = arr.length-1; i >=0; i--){
            System.out.print(arr[i]+" "); // 30 20 10 9 7 6 5.
        }
    }
    //task3
    public static void combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
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
    // task4
    public static void PosNegZero(int num){
        if (num > 0){
            System.out.println(num+ " is positive");
        }else if (num < 0){
            System.out.println(num+" is negative");
        }else {
            System.out.println(num+" is zero");
        }
    }

}
