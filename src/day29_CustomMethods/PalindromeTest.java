package day29_CustomMethods;

public class PalindromeTest {
    public static void main(String[] args) {
        palindrome("kayak");
    }

    public static void palindrome(String word){
        String reverse ="";
        for (int i = word.length()-1; i >= 0; i--){
            reverse += word.charAt(i);
        }
        System.out.println(reverse.equalsIgnoreCase(word));
    }

}
