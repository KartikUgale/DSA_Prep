package NQueens;

public class nQueens { // LeetCode 55
    public static int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        return nQueen(board, 0);
    }

    public static int nQueen(char[][] board, int row) {
        if (row == board.length) {
            return 1;
        }
        int count = 0;
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                count += nQueen(board, row + 1);
                board[row][j] = 'X';
            }
        }
        return count;
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) { // Main fun^-n
        int n = 5;
        System.out.println("Total Ways = " + totalNQueens(n));
    }
}
