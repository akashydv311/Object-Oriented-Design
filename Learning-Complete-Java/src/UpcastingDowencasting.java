
class A {

    public void show1() {
        System.out.println("Show in A");
    }
}

class B extends A {

    public void show2() {
        System.out.println("Show in B");
    }
}

public class UpcastingDowencasting {

    public static void Casting() {
        double marks = 34.56;
        int mymarks = (int) marks; // dowencasting

        System.out.println(mymarks);
    }

    public static void main(String[] args) {

        UpcastingDowencasting.Casting();

        // Upcasting Example
        A obj1 = new B();

        obj1.show1();

        // Dowencasting Example

        B obj2 = (B) obj1;

        obj2.show1();
        obj2.show2();

    }
}
