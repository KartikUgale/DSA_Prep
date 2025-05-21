public class SudokuCodePractice {
    public static boolean sudoku(int[][] sudoku) {
        return sudokuCode(sudoku, 0, 0);
    }

    public static boolean sudokuCode(int[][] sudoku, int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }
        // recursion
        int nextRow = row;
        int nextCol = col + 1;
        if (nextCol == 9) {
            nextCol = 0;
            nextRow = row + 1;
        }
        if (sudoku[row][col] != 0) {
            return sudokuCode(sudoku, nextRow, nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuCode(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // Row & Column check
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit || sudoku[row][i] == digit) {
                return false;
            }
        }
        // 3x3 grid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

        if (sudoku(sudoku)) {
            printSudoku(sudoku);
        } else {
            System.out.println("Not Correct Input");
        }
    }
}
