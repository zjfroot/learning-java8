package functionalinterface;

import java.util.function.Function;

/**
 * Created by Jifeng Zhang on 3/19/14.
 */
public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, Integer> threeFold = toInteger.andThen(a -> a * 3);

        System.out.println(threeFold.apply("123"));     // "123"
    }
}