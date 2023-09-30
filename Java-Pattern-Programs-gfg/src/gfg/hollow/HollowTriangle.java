package gfg.hollow;

//      *
//     * *
//    *   *
//   *     *
//  *       *
// ***********
public class HollowTriangle {
    public static void main(String[] args) {
        int n = 6;
        // for row
        for (int i = 1; i <= n; i++) {
            // for col - space
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // for col - sart
            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (j == 1 || i == n || j == (2 * i) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            // new line
            System.out.println();
        }
    }
}
