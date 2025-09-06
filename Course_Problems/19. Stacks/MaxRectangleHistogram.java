import java.util.Stack;

public class MaxRectangleHistogram {
    public static int maxArea(int[] heights) {
        int n = heights.length;
        int[] nsr = new int[n]; // Next Smaller Right
        int[] nsl = new int[n]; // Next Smaller Left

        Stack<Integer> stack = new Stack<>();

        // Finding next smaller element indices to the right
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            nsr[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        stack = new Stack<>();

        // Finding next smaller element indices to the left
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            nsl[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Calculating the maximum rectangle area
        int maxRectangle = 0;
        for (int i = 0; i < n; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int area = heights[i] * width;
            maxRectangle = Math.max(maxRectangle, area);
        }

        return maxRectangle;
    }

    public static void main(String[] args) {
        int[] height = { 1, 1 };
        System.out.println("Max area in histogram " + maxArea(height));

    }
}
