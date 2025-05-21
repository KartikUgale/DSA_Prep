import java.util.*;

public class LargestKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        System.out.println("Enter 5 Numbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Max Number = " + maxFind(numbers));
        sc.close();
    }

    public static int maxFind(int numbers[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
