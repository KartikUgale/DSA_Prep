public class HeapSort_descending {
    public static void heapify(int[] arr, int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int minIdx = i;

        if (left < n && arr[left] < arr[minIdx]) {
            minIdx = left;
        }
        if (right < n && arr[right] < arr[minIdx]) {
            minIdx = right;
        }
        if (minIdx != i) {
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            heapify(arr, minIdx, n);
        }
    }

    public static void sortHeap(int[] arr) {
        int n = arr.length;
        // step 1 - create minHeap
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // step 2 - push min at last
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 8, 4, 9, 6, 3 };
        sortHeap(arr);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
