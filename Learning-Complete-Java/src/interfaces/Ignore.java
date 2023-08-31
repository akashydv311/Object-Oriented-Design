package interfaces;

class P {
    public void show1() {
        System.out.println("Show1 -> P");
    }

    public void showP() {
        System.out.println("Normal show P");
    }
}

class Q extends P {
    @Override
    public void show1() {
        // super.show1();
        System.out.println("Show1 -> Q");
    }

    public void showQXc() {
        System.out.println("Normal show Q");
    }
}

public class Ignore {
    public static void main(String[] args) {

        // P p = new P();
        // p.show1();

        // Q q = new Q();
        // q.showQ();
        // q.showP();
        // q.show1();

        P pq = new Q();
        pq.showP();
        // pq.showQ();
        pq.show1();

        System.out.println("_______________________");

        // Q qp = new P(); // not possible child reference and parent object

    }
}
