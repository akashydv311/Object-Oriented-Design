package interfaces;

class Parent {
    // Parent class members and methods
    public void showParent() {
        System.out.println("In show Parent");
    }

    public void showProperty() {
        System.out.println("Property! parent");
    }
}

final class FinalChild extends Parent {
    // FinalChild class members and methods
    public void showChild() {
        System.out.println("In show Child");
    }

    @Override
    public void showProperty() {
        System.out.println("Property! child");
    }
}

public class Ignore2 {
    public static void main(String[] args) {
        Parent parentRef; // Reference variable of parent class
        parentRef = new FinalChild(); // Object of FinalChild assigned to parentRef

        parentRef.showParent();
        parentRef.showProperty();

    }
}
