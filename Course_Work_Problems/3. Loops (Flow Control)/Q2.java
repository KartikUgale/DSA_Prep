import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int EvenSum = 0;
        int OddSum = 0;

        do {
            System.out.print("Enter Number: ");
            int Num = sc.nextInt();

            if (Num % 2 == 0) {
                EvenSum += Num;
            } else {
                OddSum += Num;
            }

            System.out.println("Choose '1' for Continue & '0' for Stop");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("EvenSum= " + EvenSum);
        System.out.println("OddSum= " + OddSum);
    }
}