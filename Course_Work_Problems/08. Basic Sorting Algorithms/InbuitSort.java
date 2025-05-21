import java.util.Arrays;

public class InbuitSort {
    public static void main(String[] args) {
        int arr[] = { 7, 3, 8, 9, 2, 3 };
        Arrays.sort(arr); // in built code line for sort array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
