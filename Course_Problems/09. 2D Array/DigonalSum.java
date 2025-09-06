public class DigonalSum {
    public static void digonalSum(int arr[][]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if (!(i == arr.length - 1 - i)) {
                sum += arr[i][arr[0].length - 1 - i];
            }
        }
        System.out.print("Total Sum = " + sum);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 5, 2, 7 },
                { 1, 1, 3 } };
        digonalSum(matrix);
    }
}
