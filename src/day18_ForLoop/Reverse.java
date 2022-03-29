package day18_ForLoop;

public class Reverse {
    public static void main(String[] args) {
        String str = "Java";
        // avaJ
        str = str.substring(1) + str.substring(0,1);
        System.out.println(str);

    }
}
