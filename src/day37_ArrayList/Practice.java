package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9));
        // remove all the number that are less than 5;
        Integer num = 5;
        /*for (Integer each : list){
            if (each < 5){
                System.out.print(each+" ");
            }
        }*/
        for (int i = 0; i<=list.size()-1; i++){
            if (list.get(i) < num){
                list.remove(i);
            }
        }
        System.out.println(list);



    }
}
