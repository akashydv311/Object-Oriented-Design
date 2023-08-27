package accessmodifers;

class Test1 {

    private String name;
    private int age;

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

public class PrivateExample {
    public static void main(String[] args) {

        // we can't access the props or pethods outside the class

        Test1 test1 = new Test1();
        test1.setName("HP");
    }

}
