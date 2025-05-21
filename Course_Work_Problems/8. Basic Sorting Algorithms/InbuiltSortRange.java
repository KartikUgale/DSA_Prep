import java.util.Arrays;

public class InbuiltSortRange {
    public static void main(String[] args) {
        int num[] = { 2, 5, 8, 3, 1, 4, 6 };
        Arrays.sort(num, 1, 6); // in built code line for sort array
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
