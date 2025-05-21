import java.util.Scanner;

public class PrimeInRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            printPrimeRange(num);
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
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void printPrimeRange(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}