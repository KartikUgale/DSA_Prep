import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        printSum(num);
        sc.close();
    }

    public static int sumOfInt(int number) {
        int sum = 0;

        while(number>0){
            int lastDig = number % 10;
            sum = sum + lastDig;
            number/=10;
        }
        return sum;
    }

    public static void printSum(int n) {
        System.out.println(sumOfInt(n));
    }
}