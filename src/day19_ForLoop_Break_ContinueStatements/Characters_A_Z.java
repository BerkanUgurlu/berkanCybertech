package day19_ForLoop_Break_ContinueStatements;

public class Characters_A_Z {
    public static void main(String[] args) {
        for (char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
        for (int i = 97; i <=122; i++){
            System.out.print( (char)i+" ");
        }
        System.out.println();

        for (char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch+" ");
        }
        System.out.println();

        for (int i = 90; i >= 65; i--){
            System.out.print((char)i+" ");
        }
        System.out.println();
        /*
        for (int i = 0; i <= 65000; i++){
            System.out.print((char)i+" " );
        }*/




    }
}
