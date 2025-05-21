public class RatInMaze {
    public static void maze(int[][] maze) {
        int[][] solMaze = new int[maze.length][maze[0].length];
        if (ratMaze(maze, 0, 0, solMaze)) {
            printMazeSoln(solMaze);
        } else {
            System.out.println("Maze is closed");
        }
    }

    public static boolean ratMaze(int[][] maze, int row, int col, int[][] solMaze) {
        if (row == maze.length - 1 && col == maze[0].length - 1 && maze[row][col] == 1) {
            solMaze[row][col] = 1;
            return true;
        }

        if (isSafe(maze, row, col)) {
            if (solMaze[row][col] == 1) {
                return false;
            }
            solMaze[row][col] = 1;
            if (ratMaze(maze, row + 1, col, solMaze)) {
                return true;
            }
            if (ratMaze(maze, row, col + 1, solMaze)) {
                return true;
            }
            solMaze[row][col] = 0;
            return false;
        }
        return false;

    }

    public static boolean isSafe(int[][] maze, int row, int col) {
        return (row >= 0 && row < maze.length && col >= 0 && col < maze.length && maze[row][col] == 1);
    }

    public static void printMazeSoln(int[][] finalMaze) {
        for (int i = 0; i < finalMaze.length; i++) {
            for (int j = 0; j < finalMaze[0].length; j++) {
                System.out.print(finalMaze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] maze = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
        maze(maze);
    }
}
