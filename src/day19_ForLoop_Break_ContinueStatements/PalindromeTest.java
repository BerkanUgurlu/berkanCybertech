package day19_ForLoop_Break_ContinueStatements;

public class PalindromeTest {
    public static void main(String[] args) {
        String str = "berkan";
        String reveredStr = " ";
        for (int i = str.length()-1; i >= 0; i--){
        reveredStr += str.charAt(i);

        }
        System.out.println(reveredStr);


    }
}
