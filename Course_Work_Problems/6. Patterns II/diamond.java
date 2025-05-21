import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            diamondPattern(i, num);
        }
        for (int i = num; i >= 1; i--) {
            diamondPattern(i, num);
        }

        sc.close();
    }

    public static void diamondPattern(int i, int n) {
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }
        for (int k = 1; k <= (2 * i) - 1; k++) {
            System.out.print("* ");
        }
        System.out.println();

    }
}
