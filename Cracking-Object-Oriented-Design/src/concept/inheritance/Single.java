package concept.inheritance;

class Tester2 {
    private String msg = "Hello from tester2, Single inheritance";

    public String getMsg() {
        return this.msg;
    }
}

class Tester1 extends Tester2 {

    public void printSomthing() {
        System.out.println(getMsg());
    }
}

public class Single {
    public static void main(String[] args) {
        // example of single inheritance
        Tester1 t1 = new Tester1();
        t1.printSomthing();
    }
}
