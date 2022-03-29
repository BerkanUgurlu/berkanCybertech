package day19_ForLoop_Break_ContinueStatements;

public class SumofEvenOdd {
    public static void main(String[] args) {
        //int i = 0;
       /*
        for (int i =0; i <= 100; i+=2){
            System.out.println(i+" ");
            sum +=i;
        } */
        //System.out.println(sum);
        for (int i = 0; i <=100; i++){
            if ( i %2==0){
                System.out.println(i);
            }
        }
        System.out.println("==============");
        int sumOfOdd = 0 ;
        /*
        for (int i = 1; i<=99; i +=2 ){
            sumOfOdd +=i;
        } */
        System.out.println(sumOfOdd);

        for (int i = 0; i<=100; i++){
            if (i%2 !=0){
                sumOfOdd +=i;

            }
        }
        System.out.println(sumOfOdd);





    }
}
