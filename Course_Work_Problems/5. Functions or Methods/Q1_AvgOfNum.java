//Q.1 Write a Java method to compute the average of three numbers
import java.util.Scanner;

public class Q1_AvgOfNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 Numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("Average = " + avgOfNum(num1, num2, num3));
        sc.close();
    }

    public static int avgOfNum(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }
}