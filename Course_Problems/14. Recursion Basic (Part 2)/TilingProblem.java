public class TilingProblem { // very imp que ask by Amazon
    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return tilingProblem(n - 1) + tilingProblem(n - 2); // vertical choice + horizontal choice
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingProblem(n));
    }
}
