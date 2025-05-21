import java.util.*;

public class Q2ByForLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int EvenSum = 0, OddSum = 0;

        for (;;) {
            System.out.println("Enter Number");
            int Num = sc.nextInt();
            if (Num % 2 == 0) {
                EvenSum += Num;
            } else {
                OddSum += Num;
            }
            System.out.println("Choose 1 for Continue & 0 for Stop");
            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            }
        }
        System.out.println("Even Sum :" + EvenSum);
        System.out.println("Odd Sum :" + OddSum);
    }
}
