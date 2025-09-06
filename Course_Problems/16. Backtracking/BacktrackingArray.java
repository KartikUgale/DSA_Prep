public class BacktrackingArray {
    public static void assign(int[] arr, int i, int val) {
        if (i == arr.length) { // base case
            printArr(arr);
            return;
        }
        arr[i] = val; // work
        assign(arr, i + 1, val + 1); // recursive function
        arr[i] -= 2; // backtracking step
    }

    public static void printArr(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        assign(arr, 0, 1);
        printArr(arr);
    }
}