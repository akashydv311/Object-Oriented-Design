package gfg.triangle;

// 1 2 3 4 5 6 
//  2 3 4 5 6 
//   3 4 5 6 
//    4 5 6 
//     5 6 
//      6 

public class ReverseNumberTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        // for row
        for (int i = 1; i <= n; i++) {
            // for col - space
            for (int j = 2; j <= i; j++) {
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
