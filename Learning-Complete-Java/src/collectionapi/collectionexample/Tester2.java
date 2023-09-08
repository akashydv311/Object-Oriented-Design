package collectionapi.collectionexample;

import java.util.ArrayList;
import java.util.List;

/*
 * List allows same values
 */
public class Tester2 {
    public static void main(String[] args) {

        // Collection<Integer> num2 = new ArrayList<Integer>();

        // num2.add(78);
        // num2.add("78");

        List<Integer> num2 = new ArrayList<Integer>();

        num2.add(0, 34);
        num2.add(1, 89);
        num2.set(1, 789);
        num2.add(34);

        // num2.add("yu");

        for (int i = 0; i < num2.size(); i++) {
            System.out.println(num2.get(i));
        }
    }
}
