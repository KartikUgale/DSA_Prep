public class SpiralMatrix {
    public static void printSpiral(int arr[][]) {
        int row = 0;
        int col = 0;
        int endRow = arr.length;
        int endCol = arr[0].length;

        while (row < endRow && col < endCol) {
            for (int j = col; j < endCol - 1; j++) {
                System.out.print(arr[row][j] + " ");
            }
            for (int i = row; i < endRow - 1; i++) {
                System.out.print(arr[i][endCol - 1] + " ");
            }
            for (int j = endCol - 1; j > col; j--) {
                if (row == endRow)
                    break;
                System.out.print(arr[endRow - 1][j] + " ");
            }
            for (int i = endRow - 1; i > row; i--) {
                if (col == endCol)
                    break;
                System.out.print(arr[i][col] + " ");
            }
            row++;
            col++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String args[]) {
        int Matrix[][] = { { 11, 12, 13, 14, 15 },
                { 26, 27, 28, 29, 16 },
                { 25, 34, 35, 30, 17 },
                { 24, 33, 32, 31, 18 },
                { 23, 22, 21, 20, 19 } };
        printSpiral(Matrix);
    }
}
