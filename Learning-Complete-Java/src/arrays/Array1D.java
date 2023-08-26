package arrays;

public class Array1D {

    public void example() {
        // static arrys
        int[] nums = { 23, 34, 45, 56 };
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2] + " " + nums[3]);

        // dynamic arrys but can't change size
        // by defualt all the values is 0
        int[] arr = new int[5];
        arr[0] = 34;
        arr[1] = 678;
        arr[2] = 786;

    }
}
