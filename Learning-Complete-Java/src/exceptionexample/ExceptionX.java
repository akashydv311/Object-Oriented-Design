package exceptionexample;

public class ExceptionX {
    public static void main(String[] args) {

        int[] arr = { 34, 45 };

        try {
            // int result = (34 + 45) / 0;

            for (int i = 0; i <= arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getLocalizedMessage());

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
