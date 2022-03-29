package day33_LocalDateTime;

import java.util.Arrays;

public class uniques {
    public static void main(String[] args) {

        int[] arr = {2,2,1,3,3,4,5,6};

        for (int element : arr){
            int count = 0;
            for (int b : arr){
                if (element == b){
                    count++;
                }
            }
            if (count==1){
                System.out.print(element+" ");
            }
        }
     /*   int element = arr[0];
        int count = 0;
        for (int b : arr){
            if (element == b){
                count++;
            }
        }
        if (count==1){
            System.out.println(element); */
        System.out.println("=======================");
        int[] n1 = {10,20,20,30,40,40,50,60,70,60,80,90,100,100};
        uniqueElement(n1);
        System.out.println("================");
        double[] n2 = {10,20,20,40,50};
        uniqueElement(n2);

        System.out.println("=======================");
        String[] n3 = {"A", "B", "A", "C", "D", "D"};
        uniqueElement(n3);


        }

        public static void uniqueElement(int[] arr){
            for (int element : arr){
                int count = 0;
                for (int b : arr){
                    if (element == b){
                        count++;
                    }
                }
                if (count==1){
                    System.out.print(element+" ");
                }
            }
        }
        public static void uniqueElement(double[] arr){
        for (double element : arr){
            int count = 0;
            for (double b : arr){
                if (element == b){
                    count++;
                }
            }
            if (count==1){
                System.out.print(element+" ");
            }
        }
    }
        public static void uniqueElement(char[] arr){
        for (char element : arr){
            int count = 0;
            for (char b : arr){
                if (element == b){
                    count++;
                }
            }
            if (count==1){
                System.out.print(element+" ");
            }
        }
    }
        public static void uniqueElement(String[] arr){
        for (String element : arr){
            int count = 0;
            for (String b : arr){
                if (element == b){
                    count++;
                }
            }
            if (count==1){
                System.out.print(element+" ");
            }
        }
    }


    }


