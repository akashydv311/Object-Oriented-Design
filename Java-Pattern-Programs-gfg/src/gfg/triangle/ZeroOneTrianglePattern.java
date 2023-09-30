package gfg.triangle;

// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 
// 0 1 0 1 0 1

public class ZeroOneTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        boolean result = false;
        // for row
        for (int i = 1; i <= n; i++) {
            // for col
            for (int j = 1; j <= i; j++) {
                // print pattern
                result = (i + j) % 2 == 0;
                if (result) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            // new line
            System.out.println();
        }
    }
}
