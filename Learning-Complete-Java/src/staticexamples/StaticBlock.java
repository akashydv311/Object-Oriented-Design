package staticexamples;

class Mobile12 {
    // deciraction of static variable
    static String brandName;
    String name;
    int price;

    // Iniclication of static props
    static {
        brandName = "Samsung";
        System.out.println("In static block!");
    }

    public Mobile12(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("In const!");
    }

    public static void staticMethods() {
        System.out.println("Static methods called!");

        // this.name = "Hii";
        // we can use static variables in non static methods but can't use non static
        // variales in sttaic methods
    }

    // we can do this but passing object in method itself
    public static void exampleStatic(Mobile12 obj) {
        System.out.println(obj.name + " " + obj.price + " " + Mobile12.brandName);
    }

    public void showData() {
        System.out.println(this.name + " " + this.price);

    }
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {

        Mobile12 mymob12 = new Mobile12("Galaxy-s22", 1_20_000);
        Mobile12.staticMethods();
        mymob12.showData();

        /*
         * First it's loads class in class loader memory. so jvm called static blocks or
         * methods After this creats objects
         * 
         * So if we don't creat a objet then also static blocks called ??
         * ans is -> No
         * 
         * so how can we call static blocks without object creations
         * 
         */

        Class.forName("staticexamples.Mobile");
        Mobile12.brandName = "Sam-Sung";
        Mobile12.staticMethods();

        Mobile12.exampleStatic(mymob12);

    }
}
