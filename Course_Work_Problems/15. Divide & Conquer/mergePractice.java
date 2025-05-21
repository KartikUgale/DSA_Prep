public class mergePractice {
    public static int[] sort(int[] nums) {
        int si = 0;
        int ei = nums.length - 1;
        mergeSort(nums, si, ei);
        return nums;
    }

    public static void mergeSort(int[] nums, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(nums, si, mid);
        mergeSort(nums, mid + 1, ei);
        merge(nums, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] tempArr = new int[ei - si + 1];
        int i = si; // starting index of left arr
        int j = mid + 1; // starting index of right arr
        int k = 0;

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
        int nums[] = { 6, 3, 9, 5, 2, 8, -1 };
        sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
