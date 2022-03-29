package day29_CustomMethods;

public class Task {
    public static void main(String[] args) {

        //String[] arr = {"A", "A", "B", "C", "C"};
        String[] arr1 = {"A", "B", "B", "C"};

        for (String a : arr1){
            int count = 0;
        for (String each : arr1){
            if (a.equals(each))
                count++;
        }
        if (count==1){
            System.out.println(a);
        }
    }
    }
}
