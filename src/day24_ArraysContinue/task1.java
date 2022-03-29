package day24_ArraysContinue;
import java.util.Arrays;
/*
3. write a program that can combine two arrays of integers and then print out the maximum number
 Ex:
arr1 = { 1,2,3,4}
arr2 = {5,6,7,8}
 output:
arr3 = {1,2,3,4,5,6,7,8}
max: 8
 */
public class task1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int first = arr1.length;
        int second = arr2.length;
        int[] result = new int[first + second];
        System.arraycopy(arr1, 0, result, 0, first);
        System.arraycopy(arr2, 0, result, first , second);
        Arrays.sort(result);
        int  a = result.length;
        System.out.println(Arrays.toString(result));
        System.out.println("Max number is: "+ a);






    }
}
