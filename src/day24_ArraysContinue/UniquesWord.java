package day24_ArraysContinue;

public class UniquesWord {
    public static void main(String[] args) {
        String[] words = {"C#", "C#", "Java", "Python", "Python", "C++"};

        for (int j = 0; j<= words.length-1; j++){
        String s = words[j];
        int count = 0; // to assign the frequency of s
        for (int i = 0; i <= words.length-1; i++){
            String each = words[i];
            if (s.equals(each)){
                count++;
            }
        }
        if (count==1){
            System.out.print(s+" ");
        }
        }





    }
}
