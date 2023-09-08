package collectionapi.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Tester2 {
    public static void main(String[] args) {
        List<Integer> ml = Arrays.asList(2, 3, 4, 5, 6, 7, 8);

        Predicate<Integer> p = (t) -> t % 2 == 0; // we can use lambda xpression because Predicate is a
                                                  // FunctionalInterface

        Function<Integer, Integer> fun = (t) -> t * 2;

        int result = ml.stream()
                .filter(p)
                .map(fun)
                .reduce(0, (x, y) -> x + y);

        System.out.println(result);
    }
}
