import java.util.HashMap;

public class TwoSum {
    public static int[] sumFound(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = k - arr[i];
            if (map.containsKey(diff)) {
                return new int[] { i, map.get(diff) };
            }
            map.put(arr[i], i);
        }
        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int k = 9;

        int ans[] = sumFound(arr, k);
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}
