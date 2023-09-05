package enumexample;

enum Status {
    Running, Codding, Studying;
}

public class Test {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Status s1 = Status.Studying;
        System.out.println(s1);
        System.out.println(s1.ordinal());

        Status[] all = Status.values();
        // System.out.println(all[0]);

        for (Status allstatus : all) {
            System.out.println(allstatus);
        }
    }
}
