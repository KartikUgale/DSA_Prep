import java.util.Scanner;

public class PrintPrimeRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            printPrime(num);
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        else if (num == 2)
            return true;
        else if (num % 2 == 0)
            return false;
        else {
            for (int i = 3; i <= Math.sqrt(num); i++) {
                if (num % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void printPrime(int range) {
        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}