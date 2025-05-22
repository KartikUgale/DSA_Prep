package Java;
import java.util.HashMap;

class Solution03 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;

        for (int i=0; i<len; i++) {
            int ans = target - nums[i];
            if (map.containsKey(ans)) {
                return new int[]{map.get(ans), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
