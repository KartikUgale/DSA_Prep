public class InsertionSort {
    public static void insertion_sort(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int currPos = num[i];
            System.out.println(i + "=" + num[i]);
            int prevPos = i - 1;
            while (prevPos >= 0 && num[prevPos] > currPos) {
                num[prevPos + 1] = num[prevPos];
                prevPos--;
                System.out.print("Final i = " + num[prevPos + 1] + " ");
            }
            num[prevPos + 1] = currPos;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        insertion_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
