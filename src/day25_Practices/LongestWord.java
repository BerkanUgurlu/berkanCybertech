package day25_Practices;

public class LongestWord {
    public static void main(String[] args) {

        String [] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Abduljabar", "Mamattursun",""};
        int maxLenght = arr[0].length();
        for (String each : arr){ // to find the maxlenght
            if (each.length() > maxLenght ){
                maxLenght = each.length();
            }
        }
        System.out.println("maxLenght = " + maxLenght);
        for (String each : arr){
            if (each.length() == maxLenght);
            System.out.println("each = " + each);
        }

    }
}
