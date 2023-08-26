package arrays;

import java.util.Random;

public class Array3D {

    public void example() {
        // 3 D arrys
        int[][][] nums = new int[1][2][3];

        Random r = new Random();

        // insetring the values
        for (int arrys2D[][] : nums) {
            for (int arr[] : arrys2D) {
                for (int index : arr) {
                    index = r.nextInt(10);
                }
            }
        }

        // printing the values
        for (int arrys2D[][] : nums) {
            for (int arr[] : arrys2D) {
                for (int index : arr) {
                    System.out.print(index + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Array3D r3d = new Array3D();

        r3d.example();
    }
}
