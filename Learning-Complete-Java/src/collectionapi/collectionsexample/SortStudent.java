package collectionapi.collectionsexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}

public class SortStudent {
    public static void main(String[] args) {

        List<Student> std = new ArrayList<>();

        std.add(new Student(21, "Akash"));
        std.add(new Student(19, "Himasnhu"));
        std.add(new Student(23, "Arvind"));
        std.add(new Student(27, "Virat"));

        Comparator<Student> stdObj = new Comparator<Student>() {
            public int compare(Student std1, Student std2) {
                if (std1.age > std2.age)
                    return 1;
                return -1;
            }
        };

        Collections.sort(std, stdObj);

        for (Student s : std) {
            System.out.println(s);
        }

    }
}
