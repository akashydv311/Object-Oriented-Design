package interfaces;

@FunctionalInterface
interface LaptopX {
    void showLaptop(int i);
}

public class LamdaInterfaceX {
    public static void main(String[] args) {

        /*
         * // without lamda expression
         * Laptop lap1 = new Laptop() {
         * public void showLaptop() {
         * System.out.println("Laptop is MackBook!");
         * }
         * };
         * 
         * lap1.showLaptop();
         */

        // with lamda
        // LaptopX lapX = (i) -> System.out.println("Laptop is MackBook!" + i + " passed
        // val");

        LaptopX lapX = i -> System.out.println("Laptop is MackBook!" + i + " passed val");

        lapX.showLaptop(45);
    }
}
