public class practice {
    public static int trappedWaterCode(int[] height) {
        int left = 1;
        int right = height.length - 2;
        int lMax = height[left - 1];
        int rMax = height[right + 1];

        int trappedWater = 0;

        while (left <= right) {
            if (lMax <= rMax) {
                trappedWater += Math.max(0, lMax - height[left]);
                lMax = Math.max(lMax, height[left]);
                left++;
            } else {
                trappedWater += Math.max(0, rMax - height[right]);
                rMax = Math.max(rMax, height[right]);
                right--;
            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int num[] = { 2, 1, 5, 3, 6, 1 };
        System.out.println("Total Trapped Water: " + trappedWaterCode(num));
    }
}