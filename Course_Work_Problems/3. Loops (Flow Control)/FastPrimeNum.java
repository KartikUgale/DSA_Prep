import java.util.Scanner;

public class FastPrimeNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();

            if (num < 2) {
                System.out.println("Not Prime");
            } else if (num == 2) {
                System.out.println("Prime");
            } else if (num % 2 == 0) {
                System.out.println("Not Prime");
            } else {
                boolean isPrime = true;
                for (int i = 3; i <= Math.sqrt(num); i += 2) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not Prime");
                }
            }
        }
    }
}