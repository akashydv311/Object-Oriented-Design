package collectionapi.collectionsexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tester3 {
    public static void main(String[] args) {

        List<String> actualStrCollection = new ArrayList<>();

        actualStrCollection.add("Akash");
        actualStrCollection.add("Himanshu");
        actualStrCollection.add("Shubman");
        actualStrCollection.add("Sam");

        Comparator<String> lenStr = new Comparator<String>() {
            public int compare(String str1, String str2) {
                return Integer.compare(str1.length(), str2.length());
            }
        };

        Collections.sort(actualStrCollection, lenStr);

        System.out.println(actualStrCollection);

    }
}
