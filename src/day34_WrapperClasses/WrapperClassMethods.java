package day34_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str = "123";
        int a = Integer.parseInt(str);   // 123
        System.out.println(str + 1);
        System.out.println(a + 1);

        double d1 = Double.parseDouble("7.5"); // Autoboxing
        // double d2 = 12.5;
        System.out.println(d1 + 1 );
        String s1 = "TRUE";
        boolean b1 = Boolean.parseBoolean(s1); // parse method ignore the case sensitivity
        System.out.println(!b1);

        System.out.println("====================================");

        String s2 = "1000000";
        double d2 = Double.valueOf(s2); // unboxing
        System.out.println(d2*2);
        String s3 = "FalSe";
        boolean b2 = Boolean.parseBoolean(s3); // unboxing
        System.out.println(!b2);

    }
}
