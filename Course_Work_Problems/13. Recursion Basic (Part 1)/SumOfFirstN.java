public class SumOfFirstN {
    public static int sumOfFirst_N_nums(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + sumOfFirst_N_nums(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfFirst_N_nums(n));
    }
}
