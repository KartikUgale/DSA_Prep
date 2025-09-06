public class InversionCount2 { // Recursion Approach
    public static int inversCount(int[] nums, int n) {
        return count(nums, n, 0, 0, 1);
    }

    public static int count(int[] nums, int n, int count, int i, int j) {
        if (i >= n - 1) {
            return count;
        }
        if (nums[i] > nums[j]) {
            count++;
        }
        if (j >= n - 1) {
            i++;
            j = i;
        }
        return count(nums, n, count, i, j + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 8, 5 };
        int n = 6;
        System.out.println(inversCount(arr, n));
    }
}