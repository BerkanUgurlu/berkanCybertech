package day37_ArrayList;

import day35_ArrayList.Combine2Arrays_List;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        boolean r1 = list.contains(1);// true
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(5);
        boolean r2 = list.containsAll(elements);
        System.out.println(r2);
        System.out.println("=============================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        // Verify that 1,2, 4 are contained in the list2.
        boolean r3 = list2.containsAll(Arrays.asList(1, 2, 4));
        Integer[] arr = {10, 20, 4};
        boolean r4 = list2.containsAll(Arrays.asList(arr));

        System.out.println("==================");
        ArrayList<Integer> numbers = new ArrayList<>();
        // add: 30, 25, 40, 15, 55, 65, 75, 85, 95, 100
        //numbers.addAll(Arrays.asList(30, 25, 40, 15, 55, 65, 75, 85, 95, 100));
        Integer[] nums = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 30, 25, 40, 15, 55, 65, 75, 85, 95, 100};
        numbers.addAll(Arrays.asList(nums));
        //System.out.println(numbers); it will give you this result = [30, 25, 40, 15, 55, 65, 75, 85, 95, 100]
        System.out.println("======================");
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9));
        System.out.println(num1);
        // only keep the elements that are either 1, 2, 3, or 4.
        num1.retainAll(Arrays.asList(1, 2, 3, 9));
        System.out.println(num1);
        System.out.println("==============================================");
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmed", "Muhtar", "Ahmed", "Virginia", "Beslan", "Ibrahim", "Ahmed"));
        System.out.println(employees);
        employees.retainAll(Arrays.asList("Ahmet")); // only keep the matching element.
        employees.removeAll(Arrays.asList("Ahmed")); // it will delete the matching element.
        System.out.println(employees);




    }
    }

