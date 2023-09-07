package exceptionexample;

public class ThrowExaception {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b;

            if (result == 0) {
                throw new ArithmeticException("I don't want to show 0");
            }
        } catch (ArithmeticException e) {
            System.out.println("Defulat ans is: " + 1 + " " + e);
        } catch (Exception e) {
            System.out.println("Somthing went wrong!");
        } finally {
            System.out.println("Thank You!");
        }
    }
}
