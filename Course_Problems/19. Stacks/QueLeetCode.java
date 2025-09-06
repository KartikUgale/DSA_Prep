public class QueLeetCode {
    public static int[] nextGreater(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length - 1; j++) {
                if (nums1[i] == nums2[j] && nums1[i] < nums2[j + 1]) {
                    ans[i] = nums2[j + 1];
                    break;
                } else {
                    ans[i] = -1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums2 = { 1, 3, 4, 2 };
        int[] nums1 = { 4, 1, 2 };

        int[] ans = nextGreater(nums1, nums2);
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}