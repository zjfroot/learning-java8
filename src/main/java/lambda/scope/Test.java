package lambda.scope;

import lambda.Converter;

/**
 * Created by Jifeng Zhang on 3/19/14.
 */
public class Test {
    public static void main(String[] args) {
        //accessing local variable
        final int num = 1;
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);

        System.out.println(stringConverter.convert(2));   // 3


    }
}
