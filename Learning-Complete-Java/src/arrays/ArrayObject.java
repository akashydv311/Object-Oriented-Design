package arrays;

class Student {
    String name;
    int age;

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printData() {
        System.out.println("Name is: " + this.name + " and Age is: " + this.age);
    }
}

public class ArrayObject {

    public static void main(String[] args) {
        // Creating array object
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        s1.setData("Virat Kolhi", 34);
        s2.setData("Rohit Sharma", 35);
        s3.setData("Shubhman Gill", 23);

        Student studentsArr[] = new Student[4];

        studentsArr[0] = s1;
        studentsArr[1] = s2;
        studentsArr[2] = s3;
        studentsArr[3] = s4;

        // Enhanced for
        for (Student student : studentsArr) {
            // System.out.println(student.name + " " + student.age);
            student.printData();
        }

    }
}
