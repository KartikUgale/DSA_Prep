import java.util.Scanner;

public class HollowRhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num - i; j >= 1; j--) {
                System.out.print("  ");
            }
            System.out.print("*");
            if (i == 1 || i == num) {
                System.out.print("  *  *  *");
            } else {
                System.out.print("         ");
            }
            System.out.print("  *");
            System.out.println();
        }

        sc.close();
    }
}
