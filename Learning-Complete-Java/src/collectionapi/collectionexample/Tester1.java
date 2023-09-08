package collectionapi.collectionexample;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Initial capacity dosn't matter in arraylist it dynamlly expanded
 */
public class Tester1 {
    public static void main(String[] args) {

        Collection nums1 = new ArrayList(5);

        nums1.add(89);
        nums1.add(87);
        nums1.add(765.76);
        nums1.add("Hello");
        nums1.add('C');
        nums1.add(354.5f);

        // System.out.println(nums1.size());
        // nums1.clear();
        // System.out.println(nums1.size());

        for (Object n : nums1) {
            System.out.println(n);
        }

        // for (Object n : nums1) {
        // System.out.println((Integer) n);
        // }

    }
}
