package day23_Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {
        // String students = "Muhtar";
        String [] students = {"Cybertek", "Muhtar", "Nadir", "Asiya" };
        //                        0           1        2         3
        String name1 = students[0];
        System.out.println(name1);
        System.out.println("===================");

        String [] names = {"Mike", "Adam", "Tonny", "John", "Ammy"};
        int [] scores = {85, 70, 95, 90, 100};
        /*
        System.out.println(names[0] + " : " + scores[0]);
        System.out.println(names[1] + " : " + scores[1]);
        System.out.println(names[2] + " : " + scores[2]);
        System.out.println(names[3] + " : " + scores[3]);
        System.out.println(names[4] + " : " + scores[4]);
*/
        for (int i = 0; i <= 4; i++){
            System.out.println(names[i] + " : " + scores[i]);
        }
        System.out.println("=============");
        String[] classMates = new String[5];
        classMates[0] = "Fatih";
        classMates[2] = "Hazel";
        classMates[1] = "Viorel";
        classMates[3] = "Elkem";




    }
}
