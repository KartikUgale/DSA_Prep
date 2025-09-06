public class bubbleSort {
    public static void sortByBubble(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 9, 2, 3, 6, 1, 0, 2 };
        sortByBubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}