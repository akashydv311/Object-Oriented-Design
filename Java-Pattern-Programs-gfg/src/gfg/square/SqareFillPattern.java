package gfg.square;

// *******
// *******
// *******
// *******
// *******
// *******
// *******

public class SqareFillPattern {
    public static void main(String[] args) {
        int n = 6;
        // for row
        for (int i = 1; i <= n; i++) {
            // for col
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }
}
