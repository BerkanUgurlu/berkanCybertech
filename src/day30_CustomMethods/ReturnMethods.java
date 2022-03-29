package day30_CustomMethods;

public class ReturnMethods {
    public static void main(String[] args) {
        // int num = addition(3,4)
        add(3,4);
        int sum = add1(10,20);
        System.out.println(sum);
    }



    public static void add(int a, int b){
        int sum = a + b;
    }
    public static int add1(int a, int b){
        int sum = a + b;
        return sum;
    }

}
