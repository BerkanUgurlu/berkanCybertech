package day16;

public class String_Methods2 {
    public static void main(String[] args) {

        // isEmpty():
        String name = "Cybertek";
        System.out.println(name.isEmpty());

        String name2 ="";
        System.out.println(name2.isEmpty());

        String str1 = "Java"; // String pool.
        String str2 = new String("Java"); // It is in HEAP.
        System.out.println(str1+" "+str2);
        System.out.println(str1.equals(str2)); // true
       // Use .equals opareter when you check two string of massage.
        System.out.println(str1 == str2); // false

        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str3 == str4); // false
        System.out.println(str3.equals(str4)); // true
        String str5 = "Java";
        String str6 = "Java";
        System.out.println(str5 == str6); // true
        System.out.println(str5.equals(str6)); // true

        String str7 = "JAVA";
        String str8 = "Java";

        // contains:

        String str = "I like to learn java programming language";
        System.out.println(str.contains("python")); // false
        System.out.println(!str.contains("python")); // true

        // startsWith():

        String s1 = "Muhtar";
        System.out.println(s1.startsWith("M")); // true
        System.out.println(s1.startsWith("J"));// false


    }
}
