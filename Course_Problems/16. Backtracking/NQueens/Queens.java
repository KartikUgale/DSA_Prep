package NQueens;

public class Queens {
    public static boolean isSafe(char[][] board, int row, int col) {
        // vetrical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // digonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // digonal right
        for (int i = row - 1, j = col + 1; j < board.length && i >= 0; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void queens(char[][] board, int i) {
        if (i == board.length) {
            printBoard(board);
            return;
        }
        for (int j = 0; j < board[0].length; j++) {
            if (isSafe(board, i, j)) {
                board[i][j] = 'Q';
                queens(board, i + 1);
                board[i][j] = 'X';
            }
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("----------Chess----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 'X';
            }
        }
        queens(board, 0);
    }
}