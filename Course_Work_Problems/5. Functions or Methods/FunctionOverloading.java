import java.util.Scanner;

public class FunctionOverloading {
    public static void main (String args[]) {
        System.out.println("Enter 3 Numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a+"+"+b+" = "+ sum(a,b));
        System.out.println(a+"+"+b+"+"+c+" = "+ sum(a,b,c));

        sc.close();
    }

    public static int sum (int a, int b) {
        int sum = a+b;
        return sum;
    }

    public static int sum (int a, int b, int c) {
        int sum = a+b+c;
        return sum;
    }
}
