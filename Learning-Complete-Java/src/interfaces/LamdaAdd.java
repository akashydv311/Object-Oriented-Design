package interfaces;

@FunctionalInterface
interface Add1 {
    int add(int num1, int num2);
}

// lambda express workd only in the case of functional interfaces
public class LamdaAdd {
    public static void main(String[] args) {

        // Add1 cal = (num1, num2) -> {
        // return num1 + num2;
        // };

        Add1 cal = (num1, num2) -> num1 + num2;

        int result = cal.add(23, 45);
        System.out.println(result);
    }
}
