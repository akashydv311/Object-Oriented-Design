package enumexample;

enum MyStatus {
    Coding, Studying, Learning;
}

public class Condication {
    public static void main(String[] args) {

        MyStatus s = MyStatus.Coding;

        if (s == MyStatus.Studying) {
            System.out.println("Styding!");
        } else if (s == MyStatus.Coding) {
            System.out.println("Coding!");
        } else if (s == MyStatus.Learning) {
            System.out.println("Learning!");
        } else {
            System.out.println("Nothing!");
        }
    }
}
