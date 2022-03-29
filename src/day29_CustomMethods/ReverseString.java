package day29_CustomMethods;

public class ReverseString {
    public static void main(String[] args) {
        reverse("Berkan");
        String[] arr = {"A","B","B","C"};
        uniques(arr);
    }



    public static void reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }
    public static void uniques(String[] arr){
        for (String a: arr){
            int count = 0;
            for (String each : arr){
                if (a.equals(each)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(a+" ");
            }
        }
    }

}

