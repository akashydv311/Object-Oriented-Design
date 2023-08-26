package arrays;

import java.util.Random;

public class Array2D {

    public void example() {

        // array of arrys
        int[][] nums = new int[3][4];

        // nums[0][0] = 34;
        // nums[0][1] = 56;
        // nums[0][2] = 7;
        // nums[0][3] = 8;

        // nums[2][0] = 789;
        // nums[2][1] = 897;
        // nums[2][2] = 452;
        // nums[2][3] = 111;

        // System.out.println(nums.length);
        // System.out.println(nums[0].length);

        Random r = new Random();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = r.nextInt(100);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
        }

    }
}
