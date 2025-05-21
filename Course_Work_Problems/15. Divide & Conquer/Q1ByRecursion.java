public class Q1ByRecursion {
    public static int search(int[] nums, int target) {
        int si = 0;
        int ei = nums.length - 1;
        return recSearch(nums, target, si, ei);
    }

    public static int recSearch(int[] nums, int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[si] <= target && target < nums[mid]) {
            return recSearch(nums, target, si, mid - 1);
        } else {
            return recSearch(nums, target, mid + 1, ei);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 8, 0, 1, 2, 3 };
        int key = 5;
        System.out.println(search(nums, key));
    }
}
