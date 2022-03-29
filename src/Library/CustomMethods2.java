package Library;

public class CustomMethods2 {


    public static void removeDup(String str){
        String nonDup = "";
    for (String each : str.split("")){
        if (!nonDup.contains(each)){
            nonDup+=each;
        }
    }
        System.out.println(nonDup);
    }
}
