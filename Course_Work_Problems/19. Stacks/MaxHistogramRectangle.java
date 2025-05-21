import java.util.Stack;

public class MaxHistogramRectangle { // This is VVVIMP Question asked by Google, Microsoft, Amazon, Paytm
    public static int maxRectangle(int[] heights) {
        int maxArea = 0;
        Stack<Integer> s = new Stack<>();

        int n = heights.length;
        for (int i = 0; i <= n; i++) {
            while (!s.isEmpty() && (i == n || heights[s.peek()] >= heights[i])) {
                int height = heights[s.pop()];
                int width = s.isEmpty() ? i : i - s.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            s.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = { 2 };
        System.out.println(maxRectangle(heights));
    }
}