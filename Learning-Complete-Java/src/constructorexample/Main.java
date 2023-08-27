package constructorexample;

class Tes1 {

    private String demoName;

    public Tes1() {
        this.demoName = "Example Name";
        System.out.println("I am in construtor");
    }

    public void getDemoName() {
        System.out.println(this.demoName);
    }

}

public class Main {
    public static void main(String[] args) {

        Tes1 test1 = new Tes1();
    }
}
