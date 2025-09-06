public class InversionCount { // Brute force Approach
    public static int inversCount(int[] nums, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        int n = 5;
        System.out.println(inversCount(arr, n));
    }
}
