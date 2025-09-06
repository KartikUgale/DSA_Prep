import java.util.Scanner;

public class Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int a = (i + 1) % 2;
            for (int j = 1; j <= i; j++) {
                int n = (j + a) % 2;
                System.out.print(n);
            }
            System.out.println();
        }
        sc.close();
    }
}
