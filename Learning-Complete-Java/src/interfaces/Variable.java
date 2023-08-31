package interfaces;

interface Aq {
    int age = 21; // static final so we have to init here
    String name = "shubman";

    public void show();
}

class Bq implements Aq {
    public void show() {
        System.out.println("show");
    }
}

public class Variable {
    public static void main(String[] args) {
        // A.age = 22; Error becuse it's final

        Bq b = new Bq();
        b.show();
    }
}
