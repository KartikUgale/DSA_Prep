public class FindFirstOccurance {
    public static int findKey(int[] arr, int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }
        return findKey(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 7, 9, 4, 9, 7 };
        int key = 40;

        int index = findKey(arr, key, 0);
        if (index == -1) {
            System.out.println("Key Not found");
        } else {
            System.out.println(key + " found at index: " + index);
        }
    }
}
