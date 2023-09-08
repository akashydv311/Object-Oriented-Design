package collectionapi.collectionexample;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * if we want to sorted values 
 */
public class Tester4 {
    public static void main(String[] args) {

        Set<Integer> num4 = new TreeSet<Integer>();

        num4.add(345);
        num4.add(345);
        num4.add(123);
        num4.add(123);
        num4.add(23);

        Iterator<Integer> vales = num4.iterator();

        while (vales.hasNext()) {
            System.out.println(vales.next());
        }

        // System.out.println(vales);
        // for (int n : num4) {
        // System.out.println(n);
        // }
    }
}
