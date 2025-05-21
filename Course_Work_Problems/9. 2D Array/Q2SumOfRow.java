public class Q2SumOfRow {
  public static void sumOfRow(int[][] arr, int col) {
    int sum = 0;
    for (int row = 0; row < arr.length; row++) {
      sum += arr[row][col];
    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 1, 1, 1 } };
    int col = 1;
    sumOfRow(matrix, col);
  }
}
