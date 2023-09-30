package gfg.square;

// ******
// *    *
// *    *
// *    *
// *    *
// ******
public class SquareHollowPattern {
    public static void main(String[] args) {
        int row = 6;
        int col = 6;
        // for row
        for (int i = 1; i <= row; i++) {
            // for col
            for (int j = 1; j <= col; j++) {
                // print pattern
                if ((j > 1 && j < col) && (i != 1 && i != row)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
