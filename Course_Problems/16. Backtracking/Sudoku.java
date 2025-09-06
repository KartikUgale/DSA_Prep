public class Sudoku {
    public static boolean sudoku(int[][] arr) {
        return sudokuSolver(arr, 0, 0);
    }

    public static boolean sudokuSolver(int[][] arr, int row, int col) {
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
        if (arr[row][col] != 0) { // if pre-define number is available in index
            return sudokuSolver(arr, nextRow, nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(arr, row, col, digit)) {
                arr[row][col] = digit;
                if (sudokuSolver(arr, nextRow, nextCol)) {
                    return true;
                }
                arr[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] arr, int row, int col, int digit) {
        // row & col
        for (int index = 0; index < 9; index++) {
            if (arr[index][col] == digit || arr[row][index] == digit) {
                return false;
            }
        }
        // whole one sub_grid of 3x3
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (arr[i][j] == digit) {
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
        int[][] arr = {
                { 0, 0, 0, 0, 5, 7, 9, 0, 0 },
                { 0, 9, 0, 1, 4, 3, 0, 5, 0 },
                { 2, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 4, 1, 0, 0, 0, 0, 0, 6, 0 },
                { 6, 2, 0, 0, 0, 0, 0, 4, 1 },
                { 0, 8, 0, 0, 0, 0, 0, 9, 2 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 5 },
                { 0, 5, 0, 9, 3, 2, 0, 7, 0 },
                { 0, 0, 2, 7, 1, 0, 0, 0, 0 }
        };
        if (sudoku(arr)) {
            printSudoku(arr);
        } else {
            System.out.println("Not Available");
        }

    }
}
