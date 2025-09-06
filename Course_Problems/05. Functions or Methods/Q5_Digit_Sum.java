import java.util.Scanner;

public class Q5_Digit_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println(sumOfDigits(num));
        sc.close();
    }

    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int lastDig = number % 10;
            sum = sum + lastDig;
            number /= 10;
        }
        return sum;
    }
}