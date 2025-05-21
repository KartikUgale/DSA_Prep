import java.util.Scanner;

public class butterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            butterfly_Pattern(i, num);
        }
        for (int i = num; i >= 1; i--) {
            butterfly_Pattern(i, num);
        }

        sc.close();
    }

    public static void butterfly_Pattern(int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        for (int k = 1; k <= num - i; k++) {
            System.out.print("    ");
        }
        for (int l = 1; l <= i; l++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
