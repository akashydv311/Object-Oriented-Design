package polymorphism;

// Dynamic method dispatch

class Computer {
    public void show() {
        System.out.println("In a show A");
    }
}

class Laptop extends Computer {
    @Override
    public void show() {
        System.out.println("In a show B");
    }

    public void getData() {
        System.out.println("Data get!");
    }
}

public class MethodDispatch {
    public static void main(String[] args) {

        Laptop lap = new Laptop();
        lap.show();
        // lap.getData();

        Computer comp = new Computer();
        comp.show();

        Computer dispatch = new Laptop();
        dispatch.show();
        // dispatch.getData(); // we can't call the Non-Overridden Method of the child
        // classs from the parent class object refrence
    }
}
