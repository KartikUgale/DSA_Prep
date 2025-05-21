public class Selection_Sort {
    public static void selectionSortCode(int[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            int smaller = i;
            for (int j = i + 1; j < n.length; j++) {
                if (n[smaller] > n[j]) {
                    smaller = j;
                }
            }
            int temp = n[smaller];
            n[smaller] = n[i];
            n[i] = temp;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 7, 5, 1, 2 };
        selectionSortCode(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}