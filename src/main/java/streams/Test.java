package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jifeng Zhang on 3/19/14.
 */
public class Test {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("a1");
        stringCollection.add("a2");
        stringCollection.add("a3");
        stringCollection.add("a4");
        stringCollection.add("b5");
        stringCollection.add("b6");
        stringCollection.add("b7");
        stringCollection.add("c8");

        stringCollection.stream().forEach(s -> System.out.println(s));
        stringCollection.stream().filter(s -> s.startsWith("a")).forEach(s -> System.out.println(s));


        int max = 10000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        seqSort(values);
        parallelSort(values);

    }

    private static void parallelSort(List<String> values) {

        long t0 = System.nanoTime();

        Long count = values.parallelStream().filter(s -> s.startsWith("1")).count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("parallel sort took: %d ms", millis));
    }

    private static void seqSort(List<String> values) {
        //Sequential sort
        long t0 = System.nanoTime();

        Long count = values.stream().filter(s -> s.startsWith("1")).count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));
    }
}
