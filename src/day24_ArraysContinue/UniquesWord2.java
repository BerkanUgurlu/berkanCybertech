package day24_ArraysContinue;

public class UniquesWord2 {
    public static void main(String[] args) {
        String[] words = {"C#", "C#", "Java", "Python", "Python", "C++"};
        for (String each : words){
        String s = each;
        int count = 0;
        for (String b : words){ // b represent each element in the array.
            if (each.equals(b)){
                count++;
            }
        }
        if (count == 1){
            System.out.print(s+" ");
        }
        }
    }
}
