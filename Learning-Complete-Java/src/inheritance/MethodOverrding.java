package inheritance;

class CA {

    public void show() {
        System.out.println("A");
    }
}

class CB extends CA {
    public void display() {
        System.out.println("Display");
    }

    @Override
    public void show() {
        System.out.println("B");
    }
}

public class MethodOverrding {
    public static void main(String[] args) {

        CB b = new CB();
        b.show();

        CA a = new CA();
        a.show();
    }
}
