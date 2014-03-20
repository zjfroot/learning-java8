package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Jifeng Zhang on 3/19/14.
 */
public class ForEach {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        names.forEach(name -> System.out.println(name));
    }
}
