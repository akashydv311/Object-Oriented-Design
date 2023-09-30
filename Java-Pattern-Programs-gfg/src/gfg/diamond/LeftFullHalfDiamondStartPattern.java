package gfg.diamond;

//      *
//     **
//    ***
//   ****
//  *****
// ******
//  *****
//   ****
//    ***
//     **
//      *

public class LeftFullHalfDiamondStartPattern {
    public static void main(String[] args) {
        int n = 6;
        // for first half
        for (int i = 1; i <= n; i++) {
            // for col - space
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            // for col - start
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
        // for second half
        for (int i = n - 1; i >= 1; i--) {
            // for col - space
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            // for col - start
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }
}
