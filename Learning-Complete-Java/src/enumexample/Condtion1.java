package enumexample;

public class Condtion1 {
    public static void main(String[] args) {
        MyStatus s = MyStatus.Learning;

        switch (s) {
            case Studying:
                System.out.println("Study1");
                break;
            case Coding:
                System.out.println("Study!");
                break;
            case Learning:
                System.out.println("Learning!");
                break;
            default:
                System.out.println("Nothing!");
                break;
        }
    }
}
