// Time exceed in leetCode

public class MaxRectangle {
    public static int max_rectangle(int[] heights) {
        int maxRectangle = 0;

        for (int i = 0; i < heights.length; i++) {

            int j = i, rightCount = 1;
            while (heights[i] <= heights[j] && j < heights.length - 1) {
                rightCount++;
                j++;
            }
            if (j == heights.length - 1 && heights[i] <= heights[j])
                rightCount++;

            j = i;
            int leftCount = 0;
            while (heights[i] <= heights[j] && j > 0) {
                leftCount++;
                j--;
            }
            if (j == 0 && heights[i] <= heights[j])
                leftCount++;

            int area = heights[i] * (rightCount + leftCount - 2);
            maxRectangle = Math.max(maxRectangle, area);
        }
        return maxRectangle;
    }

    public static void main(String[] args) {
        int[] height = { 2, 1 };

        System.out.println("max rectangle = " + max_rectangle(height));
    }
}
