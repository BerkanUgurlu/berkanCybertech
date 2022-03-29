package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM/dd/yyyy, EEEE");

        LocalDate ld = LocalDate.of(2020,7,25);
        System.out.println(ld.format(dateFormat));


        /*
        hours: hh
        minutes: mm
        seconds: ss
        am/pm: a
        days name: E(three letters), EEEE ===> 4 - E
         */
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println( now.format(timeFormat) );

        // May/20/2019 Dayname 4.30 pm
        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd/yy/ EEEE hh:mm a");
        LocalDateTime time1 = LocalDateTime.of(2020,5,20,16,30);
        System.out.println(time1);
        System.out.println(time1.format(DTFormat));
        //System.out.println( LocalDate.now().format(DTFormat) );

    }
}
