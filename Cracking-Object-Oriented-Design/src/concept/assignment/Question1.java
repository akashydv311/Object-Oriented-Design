package concept.assignment;

// can you overlod main method ?
// yes!
public class Question1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Question1.main(args, 56);
    }

    public static void main(String[] args, int age) {
        System.out.println("Hello from overloded main method");
    }

}
