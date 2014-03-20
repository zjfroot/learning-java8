package lambda;

/**
 * Created by Jifeng Zhang on 3/19/14.
 */
public class ConverterMain {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123

        converter = Integer::valueOf;
        converted = converter.convert("123");
        System.out.println(converted);   // 123
    }
}
