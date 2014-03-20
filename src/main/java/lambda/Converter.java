package lambda;

/**
 * Created by Jifeng Zhang on 3/19/14.
 */
@FunctionalInterface
public interface Converter<F, T> {
    public T convert(F from);
}
