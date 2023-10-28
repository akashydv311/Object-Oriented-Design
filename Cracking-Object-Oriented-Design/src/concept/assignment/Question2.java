package concept.assignment;

// method overloding vs run time polymorphysum
class Soluction2 {
    // method overloding -> compile time polymorphism -> static polymorphism
    public void printData() {
        System.out.println("Print data-0");
    }

    public void printData(int data1) {
        System.out.println("Print data-1");
    }

    public void printData(int data1, int data2) {
        System.out.println("Print data-1 & data-2");
    }

}

// method Overriding -> run time polymorphism -> dynamic polymorphism
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Question2 {
    public static void main(String[] args) {

        Shape s = new Circle(); // Upcasting
        s.draw(); // Calls the draw method of the Circle class at runtime
    }
}
