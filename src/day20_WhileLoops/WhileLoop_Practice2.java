package day20_WhileLoops;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {

        int num =10;
        while (num < 15){
            System.out.print("Berkan"+" ");
            num++;
        }
        System.out.println();
        System.out.println("=================");
        String str = "Cybertek School";
        //            01234567
        String result = "";
        int index = str.length()-1;
        while (index >=0){
            result += str.charAt(index);

            index--;
        }
        System.out.println(result+"");



    }
}
