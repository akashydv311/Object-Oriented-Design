package constructorexample;

class Laptop {
    private String laptopName;
    private double laptopPrice;
    private String processorName;

    public Laptop() {
        this.laptopName = "HP";
        this.laptopPrice = 45_000;
        this.processorName = "i3";
    }

    public Laptop(String laptopName, double laptopPrice, String processorName) {
        this.laptopName = laptopName;
        this.laptopPrice = laptopPrice;
        this.processorName = processorName;
    }

}

public class ConstOverloding {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop();

        Laptop lap2 = new Laptop("Dell", 234_00, "i5");
    }
}
