package day34_WrapperClasses;
import java.util.ArrayList;
public class ArrayList_Intro {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(95);//  0        // autoBoxing.
        scores.add(100);// 1
        scores.add(85);//  2
        scores.add(75);//  33
        scores.add(1,65);
        System.out.println(scores);

        // 100
        System.out.println(scores.get(2));


    }
}
