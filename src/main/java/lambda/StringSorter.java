package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Jifeng Zhang on 3/19/14.
 */
public class StringSorter {
    public static void main(String[] args) {
       //java 7 way
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        System.out.println(names.toString());

        //java 8, lambda way
        names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println(names.toString());
    }
}
