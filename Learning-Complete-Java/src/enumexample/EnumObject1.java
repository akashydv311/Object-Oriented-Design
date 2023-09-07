package enumexample;

enum LaptopX {
    Mackbook, Dell, Hp, Acer;

    public int printSomthing() {
        System.out.println("Print somthing!");
        return 0;
    }
}

enum Laptop {
    Mackbook(1_50_000), Dell(80_000), Hp(), Acer(60_000);

    // for non perametised constructor -> non perametrised constructors
    private int price;

    private Laptop() {
        this.price = 30_000;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumObject1 {
    public static void main(String[] args) {
        // LaptopX lap1 = LaptopX.Mackbook;
        // System.out.print(lap1.printSomthing());

        Laptop lap2 = Laptop.Mackbook;
        System.out.println(lap2.getPrice());

        Laptop lap3 = Laptop.Hp;
        System.out.println(lap3.getPrice());
    }
}
