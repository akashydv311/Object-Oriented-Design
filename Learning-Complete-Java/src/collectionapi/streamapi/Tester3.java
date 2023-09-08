package collectionapi.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Tester3 {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Stream<Integer> sortedEvenValues = num.stream()
                .filter(n -> n % 2 == 0)
                .sorted();

        sortedEvenValues.forEach(n -> System.out.println(n));
    }

}
