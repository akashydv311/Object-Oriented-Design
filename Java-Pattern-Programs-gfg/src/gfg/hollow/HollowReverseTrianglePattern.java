package gfg.hollow;

// ***********
//  *       *
//   *     *
//    *   *
//     * *
//      *
public class HollowReverseTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        // for row
        for (int i = n; i >= n; i--) {
            // for col space
            for (int j = i; j < i; j++) {
                System.out.print(" ");
            }
            // for col start
            for (int j = 1; j <= (2 * n) - 1; j++) {
                if (j == 1 || j == i || j == (2 * i) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
