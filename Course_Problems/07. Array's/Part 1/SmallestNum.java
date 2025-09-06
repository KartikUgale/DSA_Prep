import java.util.*;

public class SmallestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[5];
        System.out.println("Enter 5 Numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Min Value = " + min_num(numbers));
        sc.close();
    }

    public static int min_num(int num[]) {
        int min = Integer.MAX_VALUE; // -infinity
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        return min;
    }
}
