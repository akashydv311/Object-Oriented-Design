package innerclass;

class A {
    private int ageA = 89;
    public String nameA;

    public void showAge() {
        System.out.println("age is " + this.ageA);
    }

    static class B {
        private String nameB = "Virat Kohli";
        public int ageB;

        public void getName() {
            System.out.println("Name is " + this.nameB);
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        // Create an instance of the static inner class A2
        A.B bObj = new A.B();

        // Set the ageB field
        bObj.ageB = 89;

        // Call the getName() method of the inner class
        bObj.getName(); // Output: Name is Virat Kohli
    }
}
