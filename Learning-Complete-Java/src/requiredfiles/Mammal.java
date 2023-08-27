package requiredfiles;

public class Mammal extends Animal {

    public Mammal(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(name + " is moving.");
    }

    protected void movePro() {
        System.out.println(name + " is moving.");
    }
}