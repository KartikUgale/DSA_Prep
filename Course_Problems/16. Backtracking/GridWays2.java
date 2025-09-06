//Que.- Find number of ways to reach from(0,0) to (n-1, n-2) in a nxm grid.
//      Allowed Moves = right or down.
public class GridWays2 {
    public static int gridWays(int m, int n) {
        int totalMoves = m + n - 2;
        int downMoves = Math.min(m - 1, n - 1);

        long result = 1;
        for (int i = 1; i <= downMoves; i++) {
            result = result * (totalMoves - i + 1) / i;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(gridWays(3, 7));
    }
}
