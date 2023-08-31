package innerclass;

// inner classes used for specific purpose

// for creating the object of inner classes we have to use parent class object becuse B is a non static class

// we can make inner class static by doing this we can create object of inner class directly

// java not allowed to make outer class as static

// if we want to interface or abstract class only once then we should use anonymous inner class

class A1 {
    private int ageA = 89;
    public String nameA;

    public void showAge() {
        System.out.println("age is " + this.ageA);
    }

    class A2 {
        private String nameB = "Virat Kolhi";
        public int ageB;

        public void getName() {
            System.out.println("Name is " + this.nameB);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        A1 a1 = new A1();

        a1.showAge();
        a1.nameA = "Shubman Gill";

        A1.A2 a2 = a1.new A2();

        a2.getName();
        a2.ageB = 78;
    }
}
