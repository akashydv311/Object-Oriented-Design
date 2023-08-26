package arrays;

public class Jagged {

    public void example() {
        // jagged arry has fixed i but not fixd j
        int[][] nums = new int[3][];
        nums[0] = new int[4];
        nums[1] = new int[5];
        nums[2] = new int[1];

        for (int arr[] : nums) {
            System.out.println(arr.length);
        }
    }

    public static void main(String[] args) {
        Jagged j = new Jagged();
        j.example();
    }
}
