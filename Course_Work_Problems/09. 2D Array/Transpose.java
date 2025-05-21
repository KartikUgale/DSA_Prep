public class Transpose {
    public static int[] printMatrix(int arr[][]) {
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            row++;
            col = 0;
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
                col++;
            }
            System.out.println();
        }
        System.out.println("Row x col = " + row + "x" + col);
        return new int[] { row, col };
    }

    public static void transpose(int[][] matrix, int row, int col) {
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        int[] matrixSize = printMatrix(matrix);
        int row = matrixSize[0];
        int col = matrixSize[1];

        transpose(matrix, row, col);

    }
}
