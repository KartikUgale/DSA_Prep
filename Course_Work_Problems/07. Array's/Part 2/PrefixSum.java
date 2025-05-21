public class PrefixSum {
    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        max_subArraySum(num);
    }

    public static void max_subArraySum(int n[]) {
        int prefix[] = new int[n.length];
        prefix[0] = n[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + n[i];
        }

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n.length; i++) {
            for (int j = i; j < n.length; j++) {
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("Sum: " + maxSum);

    }
}
