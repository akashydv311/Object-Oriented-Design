
class Demo {

    Demo() {
        System.out.println("Obj creted!");
    }

    public void show() {
        System.out.println("show called!");
    }
}

public class AnonymousObject {

    public static void main(String[] args) {

        new Demo(); // Anonymous object
        new Demo().show(); // creats new object
    }
}
