package gfg.triangle;

//      * 
//     * * 
//    * * * 
//   * * * * 
//  * * * * * 
// * * * * * * 

public class TriangleStartPattern {
    public static void main(String[] args) {
        int n = 6;
        // for row
        for (int i = 1; i <= n; i++) {
            // for col - space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for col - start
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // new line
            System.out.println();
        }
    }
}
