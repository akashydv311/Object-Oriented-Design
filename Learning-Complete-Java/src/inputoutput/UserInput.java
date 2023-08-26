package inputoutput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // Taking user input from keybord
        Scanner keybord = new Scanner(System.in);
        System.out.print("Enter any name: ");
        String name = keybord.nextLine();
        keybord.close();
        System.out.println("Entered name is: " + name);

    }
}
