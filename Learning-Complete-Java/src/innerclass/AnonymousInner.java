package innerclass;

class Az {

    public void show() {
        System.out.println("Show in Az");
    }
}

// class Ax extends Az {

// @Override
// public void show() {
// System.out.println("Show in Az");
// }
// }

public class AnonymousInner {
    public static void main(String[] args) {

        Az z = new Az() {
            public void show() {
                System.out.println("Show in main");
            }
        }; // By doing this, we can override the method without extending the class

        z.show();

    }
}
