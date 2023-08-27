package encapsulation;

class Human {
    // encapsulation example
    private String name;
    private String email;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(21);
        human1.setEmail("example@gmail.com");
        human1.setName("example name");

        System.out.println(human1.getName() + " " + human1.getAge() + " " + human1.getEmail());
    }
}
