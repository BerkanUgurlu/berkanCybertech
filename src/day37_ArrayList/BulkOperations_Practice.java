package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");
        // verify that the names Ulku, Busra are contained in students list.
        boolean r1 = students.containsAll( Arrays.asList("Busra", "Ulku") );
        System.out.println(r1);

        System.out.println("=======================");
        ArrayList<String> group1 = new ArrayList<>();
        String[] names = {"Berkan", "Berkan1", "Berkan2", "Berkan3"};
        group1.addAll(Arrays.asList(names));
        boolean t1 = group1.containsAll(Arrays.asList("Muhtar", "Muhtar1"));
        System.out.println(t1);

    }
}
