import java.util.Scanner;

public class Q2_EvenOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        printStatus(num);
        sc.close();
        sc.delimiter();
    }

    public static boolean checkIfEven(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    public static void printStatus(int n) {
        if (checkIfEven(n)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
