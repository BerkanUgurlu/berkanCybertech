package day19_ForLoop_Break_ContinueStatements;

public class OddEven2 {
    public static void main(String[] args) {
        for (int i = 1; i<=50; i++){
            if (i % 2 !=0){ // if the number is odd, then skip it.
                continue;
            }

            System.out.print(i+" ");
        }



    }
}
