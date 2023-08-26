package inputoutput;

import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {

        // Conditional Statements

        // if-else
        // if- else-if -else
        int age = 18;

        if (age > 18) {
            System.out.println("Elegible for voting!");
        } else {
            System.out.println("Age should be 18+ for voting!");
        }

        int number = 10;

        if (number == 0)
            System.out.println("Number is 0");
        else if (number > 0)
            System.out.println("Number is Positive!");
        else
            System.out.println("Number is negative");

        // Ternory Operators
        // One lineaar if else ( : ?)
        boolean result = number % 2 == 0 ? true : false;
        String result1 = number % 2 == 0 ? "Even" : "Odd";
        // System.out.println(result1);

        // Switch statement

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("1. View Profile");
        System.out.println("2. Edit Profile");
        System.out.println("3. Logout");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Viewing profile...");
                break;
            case 2:
                System.out.println("Editing profile...");
                break;
            case 3:
                System.out.println("Logging out...");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();

        System.out.println("End..");
    }
}
