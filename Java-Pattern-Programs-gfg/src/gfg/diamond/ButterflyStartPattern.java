package gfg.diamond;

// *          *
// **        **
// ***      ***
// ****    ****
// *****  *****
// ************
// ************
// *****  *****
// ****    ****
// ***      ***
// **        **
// *          *

public class ButterflyStartPattern {
    public static void main(String[] args) {
        int n = 6;
        // first half
        for (int i = 1; i <= n; i++) {
            // for col - start
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for col - space
            for (int j = 1; j <= (2 * n) - (2 * i); j++) {
                System.out.print(" ");
            }
            // for col - start
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // new line
            System.out.println();

        }
        // mid line
        for (int j = 1; j <= 2 * n; j++) {
            System.out.print("*");
        }
        // new line
        System.out.println();

        // second half
        for (int i = 1; i <= n; i++) {
            // for col - start
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // for col - space
            for (int j = 1; j <= (2 * i); j++) {
                System.out.print(" ");
            }
            // for col - star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }

    }
}
