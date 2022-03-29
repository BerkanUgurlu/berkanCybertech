package day29_CustomMethods;

public class RemoveDuplicates {

    public static void removeDup(String word){ // "abab"
        String nonDup = "";
        for (String each : word.split("")){
            if (!nonDup.contains(each)){
                nonDup += each;
            }
        }
        System.out.println(nonDup);
    }
}
