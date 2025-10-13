import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] soln(int[] numbers, int n) {
        List<Integer> list = new ArrayList<>();
        for (int num : numbers) {
            list.add(num);
        }

        int totalNums = list.size();
        while (totalNums != 2) {
            for (int i=0; i < totalNums-1; i++) {
                int sum = list.get(i) + list.get(i+1);
                sum = (sum >= 10) ? sum % 10 : sum;
                list.add(sum);
            }
            list.subList(0, totalNums).clear();
            totalNums = list.size();

            if (totalNums == 2) {
                return new int[]{list.get(0), list.get(1)};
            }
        }

        return null;
    }


}

public class Amazon01 {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7};
        int n = 4;

        Solution s = new Solution();
        System.out.println("Input: "+Arrays.toString(numbers));
        System.out.println("Output: "+Arrays.toString(s.soln(numbers, n)));
    }
}
