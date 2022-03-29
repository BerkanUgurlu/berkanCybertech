package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Integer[] arr2 = {1,2,3,4};

        for (Integer each : arr2){
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("=======================================");
        //double[] arr3 = {1,2,3,4,5,6,7};
        Double[] arr4 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0};
        // Double y1 = 4;
        for (Double each : arr4){
            System.out.print(each+" ");
        }
        char[] arr5 = {65, 66, 67, 68, 69};
        System.out.println(Arrays.toString(arr5));
        char ch = 79;
        Character ch2 = 'a';
        System.out.println(ch);
        System.out.println(ch2);


        String[] nums1 = {"12.5", "13.5", "14.5", "15.5"};
        double[] nums2 = new double[nums1.length];
        for (int i = 0; i <= nums1.length-1; i++){
            Double d1 = Double.parseDouble(nums1[i]);
            System.out.println(d1);
        }

    }
}
