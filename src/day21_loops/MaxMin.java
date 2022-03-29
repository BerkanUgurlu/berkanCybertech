package day21_loops;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {5, 5, 4, 3, 4, 1};
        int max = arr[0];

        for (int i = 1; i<= arr.length-1; i++){
            if (arr[1] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
