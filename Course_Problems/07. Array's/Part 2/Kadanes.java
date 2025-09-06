public class Kadanes {
    public static void main(String[] args) {
        int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(kadanes(num));

    }

    public static int kadanes(int n[]) {
        int sum = 0;
        int total = 0;

        for (int i = 0; i < n.length; i++) {
            sum = Math.max(sum, sum + n[i]);
            total = Math.max(total, sum);
        }

        return total;
    }
}
