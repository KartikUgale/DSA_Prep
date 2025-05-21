public class Q1 {
    public static int sortInArray(int[] nums, int target) {
        int si = 0;
        int ei = nums.length - 1;

        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (nums[mid] > target && target >= nums[si]) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 8, 0, 1, 2, 3 };
        int target = 3;

        int status = sortInArray(nums, target);
        if (status != -1) {
            System.out.println("Taget Found at inedx: " + status);
        } else {
            System.out.println("Target Not Found");
        }
    }
}
