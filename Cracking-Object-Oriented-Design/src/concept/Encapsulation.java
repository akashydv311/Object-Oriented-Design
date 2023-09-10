package concept;

// this class  demonstrat the concept of encpluction
class Tester1 {
    // props
    private String name;
    private int age;

    // we can't able to access this private props outside the class.

    // constructor
    public Tester1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        // creating tester class object
        Tester1 t1 = new Tester1("Virat Kolhi", 32);

        int age = t1.getAge();
        String name = t1.getName();

        System.out.println("Age of " + name + " is " + age);
    }
}
