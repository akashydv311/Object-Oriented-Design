package gfg.pyramid;

// *
// **
// ***
// ****
// *****
// ******
public class RightHalfPyramidPattern {
    public static void main(String[] args) {
        int n = 6;
        // for row
        for (int i = 1; i <= n; i++) {
            // for col
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }
}
