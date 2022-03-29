package day24_ArraysContinue;

public class UniquesNumbers {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,5,5,7,6};
        for (int j=0; j<= arr.length-1; j++){
        int num1 = arr[j]; // 1
        int count = 0;
        for (int i = 0; i <= arr.length-1; i++){ // only calculates the frequnecy of sum.
            int each = arr[i]; // 1 1 2 3 3
            if (each==num1){
                count++;
            }
        }
            if (count==1){
                System.out.println(num1);
            }
        }



    }
}
