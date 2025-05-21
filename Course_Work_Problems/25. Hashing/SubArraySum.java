import java.util.HashMap;

public class SubArraySum {
    public static int subArrSum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            } else {
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 2, -2, -20, 10 };
        int k = -10;

        System.out.println(subArrSum(arr, k));
    }
}
