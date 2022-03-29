package day26_MultiDimensionalArray;

import java.util.Locale;

public class Java_Python {
    public static void main(String[] args) {

        String sencente = "I love Java, Python is cool";
      /*  int java = 0;
        int python = 0;

        for (int i = 0; i <= sencente.length()-1; i++){
            if (sencente.toLowerCase().contains("java")){
                java++;
            }else if (sencente.toLowerCase(Locale.ROOT).contains("java")){
                python++;
            }
        }
        System.out.println("java = " + java);
        System.out.println("python = " + python); */
        String [] words = sencente.split(" ");
        int countJava = 0;
        int countPython = 0;
        for (String each : words){
            if (each.contains("Java")){
                countJava++;
            }else if (each.contains("Python")){
                countPython++;
            }
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);
    }
}
