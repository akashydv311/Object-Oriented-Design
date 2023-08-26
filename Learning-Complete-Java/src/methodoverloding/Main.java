package methodoverloding;

public class Main {
    public static void main(String[] args) {
        // method overloding
        Methods mv = new Methods();
        mv.addNumber();
        mv.addNumber(10);
        mv.addNumber(23, 45.67);

        System.out.println("End..");
    }
}
