package gfg.pyramid;

// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
// 1 2 3 4 5 6
public class NumberIncreasingPyramidPattern {
    public static void main(String[] args) {
        int n = 6;
        // for row
        for (int i = 1; i <= n; i++) {
            // for col
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // new line
            System.out.println();
        }
    }
}
