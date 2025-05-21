//Que.- Find number of ways to reach from(0,0) to (n-1, n-2) in a nxm grid.
//      Allowed Moves = right or down.

public class GridWays {
    public static int gridWays(int n, int m) {
        return ways(n, m, 0, 0);
    }

    public static int ways(int n, int m, int i, int j) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i >= n || j >= m) {
            return 0;
        }
        int right = ways(n, m, i + 1, j);
        int down = ways(n, m, i, j + 1);
        return right + down;
    }

    public static void main(String[] args) {
        int n = 3;
        ;
        int m = 3;
        System.out.println("Total Ways Are: " + gridWays(n, m));
    }
}
// Time complexity is bad