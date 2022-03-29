package day25_Practices;

public class Shortest_String2 {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Abi", "Ali", "Joe"};

        int minLenght = arr[0].length(); // 4


        for ( String each : arr){
            int l = each.length(); // 4   8   4   8
            if (l < minLenght){
                minLenght = l;
            }

        }
        System.out.println("minLenght = " + minLenght);
        for (String each : arr){
            if (each.length() == minLenght){
                System.out.println(each);
            }
        }








    }
}
