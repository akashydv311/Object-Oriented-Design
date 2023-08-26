
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        Scanner keybord = new Scanner(System.in);
        System.out.print("Enter any name: ");
        String name = keybord.nextLine();
        keybord.close();
        System.out.println("Entered name is: " + name);
    }
}
