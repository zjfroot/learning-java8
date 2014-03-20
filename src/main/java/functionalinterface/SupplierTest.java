package functionalinterface;

import constructorreference.Person;

import java.util.function.Supplier;

/**
 * Created by Jifeng Zhang on 3/19/14.
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Person> supplier = Person::new;
        supplier.get();
    }
}
