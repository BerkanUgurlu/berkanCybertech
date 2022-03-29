package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {
        Integer num = 100;
        int a = 100;
        byte t = 100;
        int b = t;

       //Integer z2 = b;
        Byte b1 = 50;
        int n1 = b1;
        //
        Integer n3 = new Integer(123);
        Double[] arr = new Double[3]; // null null null
        System.out.println(Arrays.toString(arr));

        int p1 = 300;
        Integer p2 = p1; // Autoboxing;

        Integer q1 = 500;
        int q2 = q1; // unBoxing

       // Double r1 = 300; // wrapper class is only dedicated to its primitive
        Double r1 = 300.0;
        double r2 = r1; // unboxing

        long l1 = 400;
        Long l2 = l1; // Autoboxing
        //
        Float f1 = 100.5f;
        Float f2 = f1;

    }
}
