public class AllOccurances {
    public static void occurances(int[] arr, int index, int key) {
        if (index == arr.length) {
            return;
        }
        if (key == arr[index]) {
            System.out.print(index + " ");
        }
        occurances(arr, index + 1, key);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 5, 7, 2, 4, 5, 4, 3, 1 };
        occurances(arr, 0, 1);
    }
}
// Q. Find all Ocuurances in array.