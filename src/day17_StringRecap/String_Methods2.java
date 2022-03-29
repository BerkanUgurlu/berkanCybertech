package day17_StringRecap;

import java.util.Locale;

public class String_Methods2 {
    public static void main(String[] args) {
        // equals:
        String s1 = "Cat"; // String pool
        String s2 = new String("Cat"); // heap
        String s3 = new String("Cat"); // heap

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s2 == s3); // false
        //
        String s4 = "java";
        String s5 = "Java";
        System.out.println(s4.equals(s5)); // false
        System.out.println(s4 == s5); // false
        // equalIgnoreCase:
        System.out.println(s4.equalsIgnoreCase(s5)); // true

        String s6 = "MuHtaR";
        String s7 = "Muhtar";
        System.out.println(s7.equalsIgnoreCase(s7)); // true
        System.out.println(s6.equals(s7)); // false
        System.out.println(s6 == s7); // false

        // isEmpty: checks if the length of String is 0
        String str = " ";
        System.out.println(str.isEmpty()); // false
        str = str.trim();
        System.out.println(str.isEmpty()); // true
        // contains:

        String str3 = "Java, C#, Python, Ruby, C++";
        // str3 = str3.toLowerCase(Locale.ROOT);
        System.out.println(str3.contains("java")); // true
        System.out.println(str3.toLowerCase(Locale.ROOT).contains("java")); // true

        String str4 = "ABCD";
        System.out.println(str4.contains("D")); // true
        // startsWith & endsWith:

        String str5 = "Cybertek School";
        System.out.println(str5.startsWith("E") || str5.contains("C"));
        // false || true ===> true
        System.out.println(str5.startsWith("CybABC")); // false

        String str6 = "Today is a great day";
        System.out.println(str6.endsWith("day")); // true
        System.out.println(str6.endsWith("great")); // false. it is end with daY







    }
}
