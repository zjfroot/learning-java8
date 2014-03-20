package functionalinterface;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by Jifeng Zhang on 3/19/14.
 */
public class PredicateTest {
    public static void main(String[] args) {
        //Predicate
        Predicate<String> predicate = (s) -> s.length() > 0;

        predicate.test("foo");              // true
        predicate.negate().test("foo");     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;


        System.out.println(nonNull.test(null));//false
        System.out.println(isNull.test(null));//true
        System.out.println(nonNull.negate().test(null));//true
        System.out.println(isNull.negate().test(null));//false

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
        System.out.println(isEmpty.test(""));//true
        System.out.println(isNotEmpty.test("1"));//true
    }
}
