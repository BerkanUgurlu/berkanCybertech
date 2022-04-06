package day37_ArrayList;

import Library.Util;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class FreqyencyOfChars {
    public static void main(String[] args) {
        String str = "AAABBC";
        ArrayList<String> list = new ArrayList<>();
        for (String each : str.split("")){
            list.add(each);
        }
        System.out.println(list);

        String nunDup = Util.removeDup(str);
        for (String each : nunDup.split("")){
            int count = Collections.frequency(list, each);
            System.out.println(each+count);

    }


    }
}
