package day31_Recap;

public class Methods_Practice {
    public static void main(String[] args) {
      // int a = 300000;
        max(10, 20);
       // System.out.println(max(10,20) * 30); -- error.
        int b = max2(10,20);
        System.out.println(b);
        System.out.println(max2(10,20));
    }
    public static void max(int a, int b){
        int max = ( a > b ) ? a : b;
        System.out.println(max);
    }
    public static int max2(int a, int b){
        return ( a > b ) ? a : b;
    }
}
