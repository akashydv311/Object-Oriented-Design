package enumexample;

enum Status {
    Running, Codding, Studying;
}

public class Test {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Status s1 = Status.Studying;
        System.out.println(s1);
    }
}
