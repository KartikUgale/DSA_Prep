public class MergeSortArr {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] tempArr = new int[ei - si + 1];
        int i = si; // starting index of left arr
        int j = mid + 1; // starting index of right arr
        int k = 0; // tempArray indexes

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                tempArr[k] = arr[i];
                i++;
            } else {
                tempArr[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            tempArr[k++] = arr[i++]; // tempArr[k]=tempArr[i]; i++; k++;
        }
        while (j <= ei) {
            tempArr[k++] = arr[j++];
        }

        for (k = 0, i = si; k < tempArr.length; k++, i++) {
            arr[i] = tempArr[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8, -1 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}