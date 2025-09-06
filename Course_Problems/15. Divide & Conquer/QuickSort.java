public class QuickSort {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr) {
        int si = 0;
        int ei = arr.length - 1;
        quickSort(arr, si, ei);
    }

    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pInx = partition(arr, si, ei);
        quickSort(arr, si, pInx - 1);
        quickSort(arr, pInx + 1, ei);
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 1 };
        sort(arr);
        printArr(arr);
    }
}
