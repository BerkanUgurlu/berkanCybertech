package day33_LocalDateTime;

import java.util.Arrays;

public class sortDescending {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5}; // {5,4,3,2,1}
        Arrays.sort(arr); // {1,2,3,4,5}
        System.out.println(Arrays.toString(arr));
        int[] reverse = new int[arr.length];
        int k = arr.length-1;

        for (int i =0; i<= reverse.length-1; i++){
            reverse[k] = arr[i];
            k--;
        }
        System.out.println(Arrays.toString(reverse));
        System.out.println("================================");
        int[] scores = {100, 75, 85, 95, 65, 55};
        scores = sortDesc(scores);
        System.out.println(Arrays.toString(scores));



    }
    public static int[] sortDesc(int[] arr){
        //int[] arr = {1,4,3,2,5}; // {5,4,3,2,1}
        //Arrays.sort(arr); // {1,2,3,4,5}
        //System.out.println(Arrays.toString(arr));
        int[] reverse = new int[arr.length];
        int k = arr.length-1;

        for (int i =0; i<= reverse.length-1; i++){
            reverse[k] = arr[i];
            k--;
        }
        return reverse;
    }
    public static double[] sortDesc(double[] arr){
        double[] reverse = new double[arr.length];
        int k = arr.length-1;

        for (int i =0; i<= reverse.length-1; i++){
            reverse[k] = arr[i];
            k--;
        }
        return reverse;
    }
    public static char[] sortDesc(char[] arr){
        char[] reverse = new char[arr.length];
        int k = arr.length-1;

        for (int i =0; i<= reverse.length-1; i++){
            reverse[k] = arr[i];
            k--;
        }
        return reverse;
    }
    public static String[] sortDesc(String[] arr){
        String[] reverse = new String[arr.length];
        int k = arr.length-1;

        for (int i =0; i<= reverse.length-1; i++){
            reverse[k] = arr[i];
            k--;
        }
        return reverse;
    }
}
