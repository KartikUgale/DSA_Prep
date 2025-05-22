package Java;
import java.util.Arrays;

public class Que_Main {
    public static void print(int[] result) {
        if (result != null) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("No solution Available!");
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;

        int[] result;

        // Runtime: 45 ms
        // Memory : 44.90 MB    Nested Loop
        Solution01 twoSum1 = new Solution01();
        result = twoSum1.twoSum(nums, target);
        print(result);

        // Runtime: 0 ms
        // Memory : 44.8 MB     Nested Loop
        Solution02 twoSum2 = new Solution02();
        result = twoSum2.twoSum(nums, target);
        print(result);
        
        // Runtime: 2 ms
        // Memory : 44.9 MB     HashMap
        Solution03 twoSum3 = new Solution03();
        result = twoSum3.twoSum(nums, target);
        print(result);
    }
}
