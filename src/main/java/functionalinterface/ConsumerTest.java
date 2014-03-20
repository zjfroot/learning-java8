package functionalinterface;

import constructorreference.Person;

import java.util.function.Consumer;

/**
 * Created by Jifeng Zhang on 3/19/14.
 */
public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<Person> namePrinter = p -> System.out.println(p.toString());
        Person person = new Person("Clark","Kent",30);
        namePrinter.accept(person);
    }
}
