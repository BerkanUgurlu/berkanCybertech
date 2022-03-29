package day31_Recap;

public class Methods_Practice2 {
    public static void main(String[] args) {
       String str = reverse("mom");
        System.out.println(str);
    }
    public static String reverse(String word){
        String reverse = "";
        for (int i = word.length()-1; i >= 0; i--){
            reverse += word.charAt(i);
        }
        if (reverse.equals(word)){
            System.out.println("it is palindrome");
        }else {
            System.out.println("it is not palindrome");
        }
        return reverse;
    }
}
