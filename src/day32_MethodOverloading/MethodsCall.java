package day32_MethodOverloading;
import Library.Util;
public class MethodsCall {
    public static void main(String[] args) {
        String firsName = "elKEm";
        String lastName = "emEt";
        String fullName = Util.formatFullName(firsName, lastName);
        System.out.println(fullName);
        String reverse = Util.uniques(fullName);
        System.out.println(reverse);
    }
}
