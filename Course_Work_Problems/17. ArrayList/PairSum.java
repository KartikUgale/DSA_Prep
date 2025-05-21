import java.util.ArrayList;

public class PairSum {
    public static boolean targetSum(ArrayList<Integer> list, int target) { // BruitForce approach T.C. = O(n^2)
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isTargetSum(ArrayList<Integer> list, int target) { // 2 point aproch for sorted in ascending order array t.c. = O(n)
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        System.out.println(targetSum(list, target)); // call to brute force aproach

        System.out.println(isTargetSum(list, target)); // call to 2 point aproch
    }
}
