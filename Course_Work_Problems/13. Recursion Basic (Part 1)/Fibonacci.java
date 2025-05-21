public class Fibonacci {
    public static int calFib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibonacci = calFib(n - 1) + calFib(n - 2);// e.g.- index 5 = index (5-1 = 4) + index (5-2 = 3)
        return fibonacci;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(calFib(n));
    }
}
