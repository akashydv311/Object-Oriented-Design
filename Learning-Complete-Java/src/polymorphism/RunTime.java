package polymorphism;

// Late binding 
// Method overrding is a part of Runtime polymorpysim

class A {
    public void parentMethod() {
        System.out.println("Parent Class Object");
    }

    public void show() {
        System.out.println("In show of Parent");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("In show of child class");
    }

    public void childMethod() {
        System.out.println("Child Class Object");
    }

}

public class RunTime {
    public static void main(String[] args) {
        // Parent object-refrence and child object
        A ab = new B();
        ab.show();
        ab.parentMethod();
    }
}
