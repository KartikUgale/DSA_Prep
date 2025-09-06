public class CountingSort {
    public static void countSortAlgo(int num[]) {
        int largest = 0;
        for (int i = 0; i < num.length; i++) {
            largest++;
        }
        int count[] = new int[largest];
        for (int i = 0; i < count.length; i++) {
            count[num[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                num[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void main(String args[]) {
        int arr[] = { 6, 5, 6, 7, 2, 3, 2, 1, 4, 5 };
        countSortAlgo(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
