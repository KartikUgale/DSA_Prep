import java.util.Scanner;

public class BestPrimeNumAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            
            printPrime(num);
        }
    }

    public static boolean primeOrNot(int num) {
        if (num < 2)
            return false;
        else if (num == 2)
            return true;
        else if (num % 2 == 0)
            return false;
        else {
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printPrime(int n) {
        if (primeOrNot(n)) {
            System.out.println("is Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

}
