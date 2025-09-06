public class TransposeWork {
    public static int[] printArray(int arr[][]) {
        int row = 0, column = 0;
        for (int i = 0; i < arr.length; i++) {
            row++;
            column = 0;
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
                column++;
            }
            System.out.println();
        }
        System.out.println("row x col = " + row + "x" + column);
        return new int[] { row, column };
    }

    public static void transposeWork(int matrix[][], int row, int col) {
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printArray(transpose);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        int[] arrayDimensions = printArray(matrix);
        int row = arrayDimensions[0];
        int column = arrayDimensions[1];

        transposeWork(matrix, row, column);
    }
}
