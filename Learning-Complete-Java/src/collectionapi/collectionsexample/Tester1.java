package collectionapi.collectionsexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester1 {
    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>();

        data.add(34);
        data.add(29);
        data.add(29);
        data.add(22);
        data.add(30);

        // sort ith collection api

        Collections.sort(data);

        for (int value : data) {
            System.out.println(value);
        }

    }
}
