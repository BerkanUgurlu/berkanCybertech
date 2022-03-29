package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> earlyBirdList = new ArrayList<>();
        earlyBirdList.add("Ibrahim");
        earlyBirdList.add("Virgina");
        earlyBirdList.add("Ziiadin");
        earlyBirdList.add("Erfan");
        earlyBirdList.add("Berkan");
        // set will replace the ELEMENT in the giving index.
        earlyBirdList.set(1, "Ali");

        System.out.println(earlyBirdList);
        System.out.println();
        System.out.println("======================");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);// 0
        list.add(2);// 1
        list.add(3);// 2
        list.add(4);// 3
        list.add(5);// 4
        list.remove(2); // [1,2,4,5] ==> size of the array is 4;
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("=======================");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);// 0
        list2.add(2);// 1
        list2.add(3);// 2
        list2.add(4);// 3
        list2.add(5);// 4

    }
}
