import java.util.*;

public class binarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int key = sc.nextInt();
        int index = binary_search_code(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at Index " + index);
        }
        sc.close();
    }

    public static int binary_search_code(int num[], int key) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
