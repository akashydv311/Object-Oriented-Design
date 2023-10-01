package gfg.hollow;

// ******
// *****
// ****
// ***
// **
// *
// **
// ***
// ****
// *****
// ******
public class Kpattern {
    public static void main(String[] args) {
        int n = 6;

        // upper part of k
        for (int i = 0; i < n; i++) {
            // start
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
        // lower part of k
        for (int i = n - 1; i >= 1; i--) {
            // start
            for (int j = 1; j <= n - (i - 1); j++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }
}
