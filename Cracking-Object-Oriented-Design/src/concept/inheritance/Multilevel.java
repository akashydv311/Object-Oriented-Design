package concept.inheritance;

class Tester3 {
    private int num1;

    public void setNum1(int num) {
        this.num1 = num;
    }

    public int getNum1() {
        return this.num1;
    }

}

class Tester4 extends Tester3 {
    public int getParentNum1() {
        setNum1(45);
        return getNum1();
    }
}

class Tester5 extends Tester4 {
    public void printData() {
        System.out.println(getParentNum1());
    }
}

public class Multilevel {
    public static void main(String[] args) {
        // multi level inheritance
        Tester5 t5 = new Tester5();

        t5.printData();
    }
}
