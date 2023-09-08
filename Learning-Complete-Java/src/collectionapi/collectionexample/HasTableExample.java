package collectionapi.collectionexample;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/*
 * HasMap and HasTable are same but HasTable is syncrosyzed 
 * means when we work with threds then use HasTable 
 */
public class HasTableExample {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Map<String, Double> studentData = new Hashtable<String, Double>();
        int i = 1;
        while (true) {
            if (i > 3)
                break;
            System.out.println("Enter student and marks ");
            String name = kb.nextLine();
            Double marks = kb.nextDouble();
            studentData.put(name, marks);
            kb.nextLine();
            i++;
        }

        System.out.println("************\n");
        for (String key : studentData.keySet()) {
            System.out.println(key + " : " + studentData.get(key));
        }
        kb.close();
    }
}
