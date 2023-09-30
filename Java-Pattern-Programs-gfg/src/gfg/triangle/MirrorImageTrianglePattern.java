package gfg.triangle;

// 1 2 3 4 5 6 
//  2 3 4 5 6 
//   3 4 5 6 
//    4 5 6 
//     5 6 
//      6 
//     5 6 
//    4 5 6 
//   3 4 5 6 
//  2 3 4 5 6 
// 1 2 3 4 5 6
public class MirrorImageTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        // for first half
        for (int i = 1; i <= n; i++) {
            // for col-space
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            // for col - number
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // second half
        for (int i = n - 1; i >= 1; i--) {
            // for col - space
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // for col - number
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            // new line
            System.out.println();
        }
    }
}
