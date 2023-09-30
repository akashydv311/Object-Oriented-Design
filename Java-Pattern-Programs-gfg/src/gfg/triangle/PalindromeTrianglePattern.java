package gfg.triangle;

//           1 
//         2 1 2 
//       3 2 1 2 3 
//     4 3 2 1 2 3 4 
//   5 4 3 2 1 2 3 4 5 
// 6 5 4 3 2 1 2 3 4 5 6 
public class PalindromeTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        // for row
        for (int i = 1; i <= n; i++) {
            // for col - space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // for col - pattern till 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // for col - pattern after 1
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            // new line
            System.out.println();
        }
    }
}
