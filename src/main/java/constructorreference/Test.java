package constructorreference;

/**
 * Created by Jifeng Zhang on 3/19/14.
 */
public class Test {
    public static void main(String[] args) {
        PersonFactory<Person> factory = Person::new;
        Person person = factory.create("Peter","Pan",30);
        System.out.println("Created person: "+person);
    }
}
