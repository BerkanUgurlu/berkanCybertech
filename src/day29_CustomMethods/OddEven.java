package day29_CustomMethods;

public class OddEven {
    public static void main(String[] args) {
     Odd();
     System.out.println();
     Even();


    }
    public static void Odd(){
        for (int i = 0; i <= 100; i++){
            if (i%3==0){
                System.out.print(i+ " ");
            }
        }
    }
    public static void Even(){
        for (int i = 0; i <= 100; i++){
            if (i % 2 ==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
