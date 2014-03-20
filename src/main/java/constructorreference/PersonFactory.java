package constructorreference;

/**
 * Created by Jifeng Zhang on 3/19/14.
 */
public interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName, Integer age);
}
