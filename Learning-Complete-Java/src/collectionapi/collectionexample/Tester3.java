package collectionapi.collectionexample;

import java.util.HashSet;
import java.util.Set;

/*
 * A collection that contains no duplicate elements
 */
public class Tester3 {
    public static void main(String[] args) {

        Set<Integer> num3 = new HashSet<Integer>();

        num3.add(45);
        num3.add(45);
        num3.add(765);
        num3.add(89);
        num3.add(89);
        num3.add(89);

        for (Integer n : num3) {
            System.out.println(n);
        }

    }
}
