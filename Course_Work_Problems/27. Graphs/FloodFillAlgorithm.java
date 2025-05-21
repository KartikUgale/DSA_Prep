public class FloodFillAlgorithm {
    public static void helper(int[][] img, int sr, int sc, int color, boolean[][] vis, int orgCol) {
        if (sr < 0 || sc < 0 || sr >= img.length || sc >= img[0].length || vis[sr][sc] || img[sr][sc] != orgCol) {
            return;
        }

        img[sr][sc] = color;

        helper(img, sr, sc - 1, color, vis, orgCol); // Left
        helper(img, sr, sc + 1, color, vis, orgCol); // Right
        helper(img, sr - 1, sc, color, vis, orgCol); // Up
        helper(img, sr + 1, sc, color, vis, orgCol); // Down
    }

    public static int[][] floodFill(int[][] img, int sr, int sc, int col) {
        boolean[][] visited = new boolean[img.length][img[0].length];
        helper(img, sr, sc, col, visited, img[sr][sc]);
        return img;
    }

    public static void main(String[] args) {
        int[][] image = {
            { 1, 1, 1 },
            { 1, 1, 0 },
            { 1, 0, 1 }
        };
        int sr = 1;
        int sc = 1;
        int color = 2;

        floodFill(image, sr, sc, color);

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
