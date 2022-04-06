package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(15);
        list.add(50);
        Collections.sort(list);
        ArrayList<Integer> reveredList = new ArrayList<>();
        for (int i = list.size()-1; i >=0; i--){
            reveredList.add(list.get(i));
        }
        System.out.println(reveredList);
    }
}
