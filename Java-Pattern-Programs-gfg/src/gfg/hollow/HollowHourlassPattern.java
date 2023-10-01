package gfg.hollow;

// * * * * * * 
//  *       * 
//   *     * 
//    *   * 
//     * * 
//      * 
//     * * 
//    *   * 
//   *     * 
//  *       * 
// * * * * * * 
public class HollowHourlassPattern {
    public static void main(String[] args) {
        int n = 6;
        // FIRST HALF
        for (int i = 1; i <= n; i++) {
            // for col space
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // for col start
            for (int j = i; j <= n; j++) {
                if (j == i || j == n || i == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // new line
            System.out.println();
        }
        // SECOND HALF
        for (int i = n - 1; i >= 1; i--) {
            // for col space
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // for col star
            for (int j = i; j <= n; j++) {
                if (j == i || j == n || i == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // new line
            System.out.println();
        }

    }
}
