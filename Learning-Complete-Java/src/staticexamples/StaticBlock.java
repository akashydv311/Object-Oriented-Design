package staticexamples;

class Mobile {
    // deciraction of static variable
    static String brandName;
    String name;
    int price;

    // Iniclication of static props
    static {
        brandName = "Samsung";
        System.out.println("In static block!");
    }

    public Mobile(String name, int price) {
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
    public static void exampleStatic(Mobile obj) {
        System.out.println(obj.name + " " + obj.price + " " + Mobile.brandName);
    }

    public void showData() {
        System.out.println(this.name + " " + this.price);

    }
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {

        Mobile mymob = new Mobile("Galaxy-s22", 1_20_000);
        Mobile.staticMethods();
        mymob.showData();

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
        Mobile.brandName = "Sam-Sung";
        Mobile.staticMethods();

        Mobile.exampleStatic(mymob);

    }
}
