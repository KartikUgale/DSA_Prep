public class FindLastOccurance {
    public static int findLastOcc(int[] arr, int key, int i) {
        if (i == 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return findLastOcc(arr, key, i - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 37, 8, 4, 3, 1, 9 };
        int key = 1;
        int index = findLastOcc(arr, key, arr.length - 1);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(key + " Fond at Index: " + index);
        }
    }
}
