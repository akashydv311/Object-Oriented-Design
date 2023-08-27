package encapsulation;

class Human1 {
    // encapsulation example
    private String name;
    private String email;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        email = email;
        System.out.println(email);
    }

    public void demoExample(int a) {
        int data = this.age;
        data = data + a;
        System.out.println(data);

    }

}

public class ThisKeyword {
    public static void main(String[] args) {

        Human1 human2 = new Human1();
        human2.setAge(21);
        human2.demoExample(10);

        human2.setEmail("example@gmail.com");
    }
}
