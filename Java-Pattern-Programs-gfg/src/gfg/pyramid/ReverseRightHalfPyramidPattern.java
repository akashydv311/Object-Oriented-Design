package gfg.pyramid;

// ******
// *****
// ****
// ***
// **
// *

public class ReverseRightHalfPyramidPattern {
    public static void main(String[] args) {
        int n = 6;
        // for row
        for (int i = 0; i < n; i++) {
            // for col
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }
}
