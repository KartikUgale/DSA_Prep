import java.util.ArrayDeque;

public class MaxOfallIdx { // Deque method (best time coplexity O(n))
    public static int[] findMax(int[] arr, int k, int n) {
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        int[] result = new int[n - k + 1];

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.getFirst() < i - k + 1) {
                dq.removeFirst();
            }

            while (!dq.isEmpty() && arr[dq.getLast()] < arr[i]) {
                dq.removeLast();
            }

            // add current elements index
            dq.addLast(i);

            // Add the maximum of the current window to the result
            if (i >= k - 1) {
                result[j++] = arr[dq.getFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        int n = arr.length;

        int[] res = findMax(arr, k, n);

        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
