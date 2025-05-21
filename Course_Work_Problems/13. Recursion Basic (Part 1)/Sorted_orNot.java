public class Sorted_orNot {
    public static boolean isSorted(int[] arr, int i) {
        System.out.println("Fun-n call");
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(isSorted(arr, 0));
    }
}