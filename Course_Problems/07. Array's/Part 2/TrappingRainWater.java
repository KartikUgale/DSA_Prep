public class TrappingRainWater {
    public static int sub(int height[]) {
        int left = 1;
        int right = height.length - 2;
        int lMax = height[left - 1];
        int rMax = height[right + 1];
        int TrappedWater = 0;

        while (left <= right) {
            if (lMax <= rMax) {
                TrappedWater += Math.max(0, lMax - height[left]);
                lMax = Math.max(lMax, height[left]);
                left++;
            } else {
                TrappedWater += Math.max(0, rMax - height[right]);
                rMax = Math.max(rMax, height[right]);
                right--;
            }
        }
        return TrappedWater;
    }

    public static void main(String[] args) {
        int num[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Total Trapped Water: " + sub(num));
    }
}