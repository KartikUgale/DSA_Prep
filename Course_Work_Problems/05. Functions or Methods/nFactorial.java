import java.util.Scanner;

public class nFactorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println(num + "! = " + Factorial(num));

        sc.close();
    }

    public static int Factorial(int num) {
        int i = 1;
        int multy = 1;

        while (i <= num) {
            multy = multy * i;
            i++;
        }
        return multy;
    }

}