import java.util.*;

public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        System.out.print("Enter Key: ");
        int key = sc.nextInt();

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at Index: " + index);
        }
        sc.close();
    }

    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
