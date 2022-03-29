package day31_Recap;

import java.util.Locale;

public class frequencyOfCharacters {
    public static void main(String[] args) {
        String str = "bErKaN uGurlU"; // ==> A2B3C3
        String expectedResult = "";

        str = str.substring(0,1).toUpperCase(Locale.ROOT).substring(1,str.length()-1).toLowerCase();
        System.out.println(str);
    }
}
