package gfg.diamond;

//      *
//     ***
//    *****
//   *******
//  *********
// ***********
//  *********
//   *******
//    *****
//     ***
//      *
public class DiamondStartPattern {
    public static void main(String[] args) {
        int n = 6;
        // first half
        for (int i = 1; i <= n; i++) {
            // for col - space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for col - start
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
        // second half
        for (int i = n - 1; i >= 1; i--) {
            // for col - space
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            // for col - start
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }
}
