import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        Integer arr[] = { 1, 4, 6, 2, 5, 3, 7 };
        Arrays.sort(arr, Collections.reverseOrder()); // in built code line to sort array in decriment way
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
