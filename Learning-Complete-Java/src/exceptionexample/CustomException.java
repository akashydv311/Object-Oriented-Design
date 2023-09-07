package exceptionexample;

class AkashException extends Exception {

    public AkashException(String msg) {
        // System.out.println("I don't want comiler's exception!");
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {

        try {
            int result = 34 / 0;
            // System.out.println(result);
            if (result == 0) {
                throw new AkashException("I don't want to show 0");
            }
        } catch (AkashException e) {
            System.out.println("Custom Exception " + e);
        } catch (Exception e) {
            System.out.println("Somthing went wrong!");
        } finally {
            System.out.println("Thank You!");
        }

    }
}
