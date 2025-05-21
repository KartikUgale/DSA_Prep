public class Spiral {
    public static void spmatrix(int matrix[][]) {
        int row = 0;
        int col = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        while (row <= endRow && col <= endCol) {
            // Top
            for (int j = col; j <= endCol; j++) {
                System.out.print(matrix[row][j] + " ");
            }
            // Right
            for (int i = row + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // Bottom
            for (int j = endCol - 1; j >= col; j--) {
                if (row == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // Left
            for (int i = endRow - 1; i > row; i--) {
                if (col == endCol) {
                    break;
                }
                System.out.print(matrix[i][col] + " ");
            }
            row++;
            col++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 11, 12, 13, 14, 15, 1, 2 },
                { 26, 27, 28, 29, 16, 3, 4 },
                { 25, 34, 35, 30, 17, 5, 6 },
                { 24, 33, 32, 31, 18, 7, 8 },
                { 23, 22, 21, 20, 19, 9, 10 } };
        spmatrix(matrix);
    }
}