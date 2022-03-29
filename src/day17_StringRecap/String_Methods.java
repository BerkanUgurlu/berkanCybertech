package day17_StringRecap;

import java.util.Locale;

public class String_Methods {
    public static void main(String[] args) {
        // CharAt(index):
        String str = "Cybertek";
        //            01234567
        char ch1 = str.charAt(1);
        System.out.println(ch1);

        // +:
        String str2 = "Cybertek";
        str2 = str2+ " "+ "School";
        System.out.println(str2);

        String s3 = "Cybertek School";
        //           01234567
        int l = s3.length();//16
        System.out.println(l);

        // lastIndex:
        char ch2 = s3.charAt(l-1); // str.lenght()-1 == 15
        System.out.println(ch2);
        System.out.println("Last index: "+ (l-1));

        // upperCase & lowerCase

        String str4 = "cybertek";
        str4 = str4.toUpperCase(Locale.ROOT);
        System.out.println(str4);

        String str5 = "CYBERTEK";
        str5 = str5.toLowerCase();
        System.out.println(str5);

        // trim():
        String str6 = "   Cybertek School    ";
        str6 = str6.trim();
        System.out.println(str6);

        // substring:
        String str7 = "I like java Language";
        String word = str7.substring(7,11);
        System.out.println(word);

        // indexOf & lastIndexOf ==> int
        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int i1 = str8.indexOf("W");
        System.out.println(i1);
        char ch3 = str8.charAt(i1);
        System.out.println(ch3);

        int i2 = str8.indexOf(", W") +2;
        System.out.println(i2);
        int i3 = str8.indexOf("We");
        System.out.println(i3);

        String str9 = "Java Java Java";
        int i4 = str9.lastIndexOf("J");
        int i5 = str9.indexOf("J");
        System.out.println(i4+" "+i5);
        String s6 = str9.substring(5, 9);
        System.out.println(s6);
        int i6 = str6.indexOf(" Java ")+1;
        System.out.println(i6);

        String s1 = "I like Java, Java is a programming language";
        s1 = s1.replace("Java","C#");
        System.out.println(s1);
        String s2 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java","C#");
        System.out.println(s2);
        String s7 = "I like Java, Java is a programming language";
        s7 = s7.replace("Java is","C# is");
        System.out.println(s7);






    }
}
