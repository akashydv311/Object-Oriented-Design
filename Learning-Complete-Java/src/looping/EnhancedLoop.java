package looping;

// Enhanced and For each loop are the same

public class EnhancedLoop {

    public void example() {

        int nums[][] = new int[3][4];
        // by defualt all values ore 0

        for (int arr[] : nums) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
        }
    }

    public static void main(String[] args) {

        EnhancedLoop el = new EnhancedLoop();
        el.example();
    }
}
