package gfg.triangle;

//      01 
//     02 03 
//    04 05 06 
//   07 08 09 10 
//  11 12 13 14 15 
// 16 17 18 19 20 21
public class IncreasingNumberTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        int num = 1;
        // for row
        for (int i = 1; i <= n; i++) {
            // for col - space
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            // for col - number
            for (int j = 1; j <= i; j++) {
                if (num < 10) {
                    System.out.print("0" + num + " ");
                } else {
                    System.out.print(num + " ");
                }
                num++;
            }
            // new line
            System.out.println();
        }
    }
}
