package collectionapi.streamapi;

import java.util.Arrays;
import java.util.List;

public class ForEachEx {

    public static void main(String[] args) {

        List<Integer> l2 = Arrays.asList(23, 34, 45, 34, 23, 34, 45);

        l2.forEach(n -> System.out.println(n));

    }

    // public static void main(String[] args) {

    // List<Integer> l2 = Arrays.asList(23, 34, 45, 34, 23, 34, 45);

    // Consumer<Integer> con = n -> System.out.println(n);

    // l2.forEach(con);

    // }

    // public static void main(String[] args) {

    // List<Integer> l2 = Arrays.asList(23, 34, 45, 34, 23, 34, 45);

    // Consumer<Integer> con = (Integer n) -> {
    // System.out.println(n);
    // };

    // l2.forEach(con);

    // }

    // public static void main(String[] args) {

    // List<Integer> l2 = Arrays.asList(23, 34, 45, 34, 23, 34, 45);

    // Consumer<Integer> con = new Consumer<Integer>() {
    // public void accept(Integer n) {
    // System.out.println(n);
    // }
    // };

    // l2.forEach(con);

    // }

    // public static void main(String[] args) {

    // List<Integer> l1 = Arrays.asList(23, 34, 45, 34, 23, 34, 45);

    // // l1.forEach(n -> System.out.println(n * 2));

    // // theird way

    // // l1.forEach(n -> System.out.println(n));

    // // second way

    // // for (int n : l1) {
    // // System.out.println(n);
    // // }

    // // first way
    // // for (int i = 0; i < l1.size(); i++) {
    // // System.out.println(l1.get(i));
    // // }
    // }
}
