import java.util.*;

public class Q6byMethods {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            StarPatternRow(i, num);
        }
        for (int i = num; i >= 1; i--) {
            StarPatternRow(i, num);
        }

        sc.close();
    }

    public static void StarPatternRow(int stars, int rows) {
        for (int j = 1; j <= stars; j++) {
            System.out.print("* ");
        }
        for (int k = 1; k <= rows - stars; k++) {
            System.out.print("    ");
        }
        for (int l = 1; l <= stars; l++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
