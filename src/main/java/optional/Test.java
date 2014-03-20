package optional;

import constructorreference.Person;
import constructorreference.PersonFactory;

import java.util.Optional;
import java.util.Random;

/**
 * Created by Jifeng Zhang on 3/19/14.
 */
public class Test {
    public static void main(String[] args) {

        Optional<Person> optional = createClark();
        optional.ifPresent(p -> System.out.println(p.toString()));
    }

    static Optional<Person> createClark(){
        PersonFactory factory = Person::new;
        Random r = new Random();
        return r.nextInt(10) > 5?Optional.of(factory.create("Clark", "Kent", 30)):Optional.empty();
    }
    static Person createLuis(){
        PersonFactory factory = Person::new;
        return factory.create("Luis","Lain",29);
    }

}
