package day23_Arrays;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "ABAB"; // A2B2
        String nonDup = "";  // "AB"
        String result = ""; // "A2B2"

        for (int i = 0; i<= str.length()-1; i++){
            String ch = "" + str.charAt(i);
            if (!nonDup.contains(ch)){
                nonDup += ch;
            }
        }
        System.out.println(nonDup);


        char ch = nonDup.charAt(0);
        int count = 0;
        for (int i = 0; i <= str.length()-1; i++ ){
            if (str.charAt(i) == ch){
                count +=1;
            }
        }
        result += "" + nonDup.charAt(0) + count;
        System.out.println(result);





    }
}
