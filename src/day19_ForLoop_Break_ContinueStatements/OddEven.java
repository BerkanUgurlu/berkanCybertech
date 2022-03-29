package day19_ForLoop_Break_ContinueStatements;

public class OddEven {
    public static void main(String[] args) {
       // 1 3 5 7 9 11 ... 99
        for (int i = 1; i <= 99; i += 2 ){
            if (i % 5==0 && i % 3==0){
                System.out.print(i+" ");
            }

        }



    }
}
