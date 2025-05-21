import java.util.Scanner;

public class BinomialCoeff {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("for Calculate nCr \nEnter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        binCoeff(n, r);
        System.out.println(n + "C" + r + " = " + binCoeff(n, r));

        sc.close();
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }

    public static int factorial(int num) {
        for (int i = num - 1; i > 0; i--) {
            num *= i;
        }
        return num;
    }
}
