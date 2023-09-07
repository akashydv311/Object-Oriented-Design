package exceptionexample;

public class Main {
    public static void main(String[] args) {

        int x = 0;

        try {
            int y = 18 / x;
        } catch (Exception e) {
            System.out.println("Somthing goes wrong!");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Byy...");
        }
        System.out.println("Thanks You!");

    }
}
