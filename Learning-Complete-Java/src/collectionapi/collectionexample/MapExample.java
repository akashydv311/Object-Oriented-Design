package collectionapi.collectionexample;

import java.util.HashMap;
import java.util.Map;

/*
 * When we are not working with threds then we can use HasMap
 */
public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> student = new HashMap<>();

        student.put("Akash YAdav", 23);
        student.put("Himanshu", 24);
        student.put("Arvind", 34);

        // existing data
        student.put("Himanshu", 19);

        // System.out.println(student);
        for (String key : student.keySet()) {
            System.out.println(key + " : " + student.get(key));
        }
    }
}
