package collectionapi.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Tester1 {
    public static void main(String[] args) {

        List<Integer> nums1 = Arrays.asList(3, 2, 5, 8, 4, 3, 5);

        // Stream<Integer> s1 = nums1.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n * 2);

        // int result = s3.reduce(0, (x, y) -> x + y);

        int ans = nums1.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (x, y) -> x + y);

        System.out.println(ans);

        // System.out.println(result);

        // s1.forEach(n -> System.out.println(n));
        // s2.forEach(n -> System.out.println(n));
        // s3.forEach(n -> System.out.println(n));

    }
}
