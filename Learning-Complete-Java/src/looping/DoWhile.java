package looping;

import java.util.Random;
import java.util.Scanner;

class DoWhile {

    public int takingInput() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = kb.nextInt();
        return number;
    }

    public void DoWhile() {
        // game random int
        Random random = new Random();
        int randomInt = random.nextInt(100);
        System.out.println(randomInt);
        int gess = 0;

        System.out.println("Gess the number?");
        do {
            if (gess < randomInt)
                System.out.println("Less ");
            else
                System.out.println("More ");

            gess = takingInput();
        } while (gess != randomInt);

        System.out.println("Number is: " + gess);
    }
}
