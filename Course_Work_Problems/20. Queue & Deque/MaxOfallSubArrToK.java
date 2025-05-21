public class MaxOfallSubArrToK { // Nested loop approach which takes time coplexity O(n*k)
                                // (always use Deque method for this sliding window question)
    public static void findMax(int[] arr, int k, int n) {

        if (k <= 0 || k > n) {
            System.out.println("Invalid Value of K");
            return;
        }

        int[] maxArr = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int maxAtIdx = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {       // from i to next k steps
                maxAtIdx = Math.max(maxAtIdx, arr[j]);
            }
            maxArr[i] = maxAtIdx;
        }

        for (int val : maxArr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        int n = arr.length;

        findMax(arr, k, n);
    }
}