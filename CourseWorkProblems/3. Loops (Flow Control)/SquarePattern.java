import java.util.*;

public class SquarePattern {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();
        
        System.out.println("---For Loop---");

        for (int i=1; i<=num; i++) {
            for (int j=1; j<=num; j++) {
                System.out.print("O ");
            }
            System.out.println();
        }

        System.out.println("---While Loop---");
        int n = 1;

        while (n <= num) {
            int m = 1;
            while (m <= num) {
                System.out.print("Q ");
                m++;
            }
            System.out.println();
            n++;
        }
    }
}