public class FactorialOfNumN {
    public static int factorialOfN(int n) {
        if (n == 0) {
            return 1;
        }
        factorialOfN(n - 1); // Recursion function
        int fact = n * factorialOfN(n - 1);
        return fact;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorialOfN(num));
    }
}
