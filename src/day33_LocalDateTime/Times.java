package day33_LocalDateTime;

import java.time.LocalTime;

public class Times {
    public static void main(String[] args) {

        LocalTime t1 = LocalTime.of(15,45,55);
        System.out.println(t1);

        LocalTime now = LocalTime.now();
        System.out.println(now);

    }
}
