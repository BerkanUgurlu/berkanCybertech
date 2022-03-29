package day23_Arrays;

public class FrequencyOfChars2 {
    public static void main(String[] args) {
        String str = "BBCCDD";
        String nonDup = ""; // "B"

        for (int i = 0; i <= str.length()-1; i++){
        String ch = "" + str.charAt(i); // B, B, C, C, D, D.
            if (nonDup.contains(ch)){
                continue;
            }else {
                nonDup += ch;
            }

        }

        String expectedResult = "";
        // str = "BBCCDD"    nonDup = "BCD" ====> "B2C2D2"
        char ch1 = nonDup.charAt(0);
        int count1 = 0;
        for (int i = 0; i <= str.length()-1; i++){
            if (str.charAt(i) == ch1){
                count1++;
            }
        }
        expectedResult += " " + ch1 + count1;
        char ch2 = nonDup.charAt(1);
        int count2 = 0;
        for (int i = 0; i <= str.length()-1; i++){
            if (str.charAt(i) == ch2){
                count2++;
            }
        }
        expectedResult += " " + ch2 + count2;

        char ch3 = nonDup.charAt(2);
        int count3 = 0;
        for (int i = 0; i <= str.length()-1; i++){
            if (str.charAt(i) == ch3){
                count3++;
            }
        }
        expectedResult += " " + ch3 + count3;


        System.out.println(expectedResult);



    }
}
