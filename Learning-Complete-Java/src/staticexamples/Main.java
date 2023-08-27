package staticexamples;

class Mobile {
    // deciraction of static variable
    static String brandName;
    String name;
    int price;

    public void showData() {
        System.out.println(this.name + " " + this.price);
    }
}

public class Main {
    public static void main(String[] args) {

        Mobile mob1 = new Mobile();
        Mobile mob2 = new Mobile();

        Mobile.brandName = "Samsung";

        mob1.name = "Galexy-123";
        mob2.name = "Samsung guru";
        mob1.price = 34500;
        mob2.price = 300;

        mob1.showData();
        mob2.showData();

        System.out.println("End...");
    }
}
