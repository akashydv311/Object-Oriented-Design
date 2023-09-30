package gfg.triangle;

//      1 
//     2 2 
//    3 3 3 
//   4 4 4 4 
//  5 5 5 5 5 
// 6 6 6 6 6 6
public class NumberTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        // for row
        for (int i = 1; i <= n; i++) {
            // for col - space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for col - number
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // new line
            System.out.println();
        }
    }
}
