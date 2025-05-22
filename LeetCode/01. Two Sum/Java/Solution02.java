package Java;
class Solution02 {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;

        for (int i=1; i<len; i++) {
            for (int j=i; j<len; j++) {
                if (nums[j] + nums[j-i] == target) {
                    return new int[] {j-i,j};
                }
            }
        }

        return null;
    }
}
