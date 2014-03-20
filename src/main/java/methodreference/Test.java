package methodreference;

import lambda.Converter;

/**
 * Created by Jifeng Zhang on 3/19/14.
 */
public class Test {
    public static void main(String[] args) {
        Word word = new Word();
        Converter<String, String>  converter = word::startsWith;
        String converted = converter.convert("Java");
        System.out.println(converted);
    }
}
