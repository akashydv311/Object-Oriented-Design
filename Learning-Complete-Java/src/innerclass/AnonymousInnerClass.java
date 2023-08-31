package innerclass;

// if we want to interface or abstract class only once then we should use anonymous inner class

abstract class Axc {
    public abstract void show();

    public abstract void printAxc();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        Axc xc = new Axc() {

            @Override
            public void show() {
                // TODO Auto-generated method stub
                System.out.println("In show main");
            }

            @Override
            public void printAxc() {
                // TODO Auto-generated method stub
                System.out.println("In main printAxc ");
            }

        };

        xc.show();
        xc.printAxc();
    }
}
