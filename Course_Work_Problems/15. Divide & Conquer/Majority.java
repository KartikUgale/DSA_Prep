public class Majority {
    public static int majorityNum(int[] nums) {
        int currNum = nums[0];
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                currNum = num;
            } else {
                count += (currNum == num) ? +1 : -1;
            }
        }
        count = 0;
        for (int num : nums) {
            if (currNum == num) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return currNum;
        }
        throw new IllegalArgumentException("Not majority exist");
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 2, 3, 4, 2, 2 };
        System.out.println(majorityNum(nums));
    }
}
