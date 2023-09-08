package collectionapi.collectionsexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tester2 {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Integer> data = new ArrayList<>();

        data.add(34);
        data.add(29);
        data.add(29);
        data.add(22);
        data.add(30);

        Collections.sort(data, com);

        System.out.println(data);

        // for (int value : data) {
        // System.out.println(value);
        // }
    }
}
