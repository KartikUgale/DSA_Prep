public class HeapSort_ascending {
    public static void heapify(int[] arr, int i, int size) { // max heap
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }
        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }
        if (maxIdx != i) {
            // swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    public static void sortHeap(int[] arr) {
        // step 1 - build maxHeap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) { // only for non leaf nodes (or for parent nodes)
            heapify(arr, i, n);
        }

        // push largest at end
        for (int i = n - 1; i > 0; i--) {
            // swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 8, 3, 5, 1, 2 };
        sortHeap(arr);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}