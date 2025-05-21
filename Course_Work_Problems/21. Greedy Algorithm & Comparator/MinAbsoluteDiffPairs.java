import java.util.Arrays;

public class MinAbsoluteDiffPairs {
    public static void main(String[] args) {
        int[] a = { 4, 1, 8, 7 };
        int[] b = { 2, 3, 6, 5 };

        Arrays.sort(a);
        Arrays.sort(b);

        int minDiff = 0;
        // int diff = 0;
        for (int i = 0; i < a.length; i++) {

            // if (a[i]>=b[i]) { // this can work if we dont use java's inbuilt function
            //  "Math.abs()";
            //  diff = a[i] - b[i];
            // } else {
            // diff = b[i] - a[i];
            // }
            // minDiff += diff;

            minDiff += Math.abs(a[i] - b[i]); // Math.abs() gives absolute values
        }
        System.out.println("Minimum Absolute Difference in pair = " + minDiff);
    }
}
