package day20_WhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabb"; // "ab"
        //            0123
        String result = ""; // "a"
        for (int i = 0; i <= str.length()-1; i++ ){
            String s = ""+str.charAt(i);
            if (result.contains(s)){ // if the character is already contained in result, we will not add it.
               // result += s;
                continue;
            }
          result += s;
        }
        System.out.println(result);



    }
}
