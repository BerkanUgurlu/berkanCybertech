package day25_Practices;

public class Shortest_String {
    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Abi", "Ali", "Joe"};

        int minLenght = arr[0].length(); // 4


        for (int i =0; i <= arr.length-1; i++){
            int l = arr[i].length(); // 4   8   4   8
            if (l < minLenght){
                minLenght = l;
            }

        }
        System.out.println("minLenght = " + minLenght);
        for (int i = 0; i <= arr.length-1; i++){
            if (arr[i].length() == minLenght){
                System.out.println(arr[i]);
            }
        }


    }
}
