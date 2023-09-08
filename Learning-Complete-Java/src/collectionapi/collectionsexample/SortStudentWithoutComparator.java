package collectionapi.collectionsexample;

import java.util.ArrayList;
import java.util.List;

class StudentData implements Comparable<Student> {
    int age;
    String name;

    public StudentData(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1;
        return -1;
    }

}

public class SortStudentWithoutComparator {
    public static void main(String[] args) {
        List<StudentData> std1 = new ArrayList<>();

        std1.add(new StudentData(21, "Akash"));
        std1.add(new StudentData(19, "Himanshu"));
        std1.add(new StudentData(23, "Arvind"));
        std1.add(new StudentData(27, "Virat"));

        // Collections.sort(std1);

        for (StudentData s : std1) {
            System.out.println(s);
        }
    }
}
