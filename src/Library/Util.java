package Library;

import java.util.Arrays;

public class Util {



    public static String removeDup(String str){
        String nonDup = "";
        for (String each : str.split("")){
            if (!nonDup.contains(each)){
                nonDup+=each;
            }
        }
        return nonDup;
    }
    public static String uniques(String str){
        String uniques = "";
        for (char each : str.toCharArray()){
            int count = frequency(str, each);
            if (count==1){
                uniques += each;
            }
        }
        return uniques;
    }
    public static String formatFullName(String first, String lastName){
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        String fullName = first + " " + lastName;
        return fullName;
    }

    public static int frequency (String str, char ch){
        int count = 0;
        for ( char each : str.toCharArray() ){
            if (each==ch){
                count++;
            }
        }
        return count;
    }
    public static double calculator(double num1, char oper, double num2){
        double result = (oper == '+') ? num1+num2 : (oper == '-') ? num1-num2 : (oper == '*') ? num1*num2 :
                (oper == '/') ? num1/num2 : (oper == '%') ? num1%num2 : 0;
        return result;
    }
    public static int[] addElement(int[] arr, int num){
        int[] arr2 = new int[arr.length+1];
        arr2[arr2.length-1]=num;

        int i = 0;
        for (int each : arr) {
            arr2[i] = each;
            i++;
        }
        return arr2;
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
    public static Double[] sortDesc(Double[] arr){

        Arrays.sort(arr);
        Double[] arr2 = new Double[arr.length];
        int k = arr.length-1;
        for (int i =0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    public static Integer[] sortDesc(Integer[] arr) {
        Arrays.sort(arr);
        Integer[] arr2 = new Integer[arr.length];
        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    public static Character[] sortDesc(Character[] arr) {
        Arrays.sort(arr);
        Character[] arr2 = new Character[arr.length];
        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

}
