package functionalinterface;

import constructorreference.Person;
import constructorreference.PersonFactory;

import java.util.Comparator;

/**
 * Created by Jifeng Zhang on 3/19/14.
 */
public class ComparatorTest {
    public static void main(String[] args) {
        Comparator<Person> ageComparator = (p1, p2) -> p1.getAge().compareTo(p2.getAge());
        PersonFactory<Person> factory = Person::new;
        Person clark = factory.create("Clark","Kent",30);
        Person luis = factory.create("Luis","Lain",29);
        System.out.println(ageComparator.compare(clark,luis));//true, 1
    }
}
