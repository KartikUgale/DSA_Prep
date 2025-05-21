import java.util.ArrayList;

public class PairSum2 {
    public static boolean isTargetFound(ArrayList<Integer> list, int target) {
        int pivote = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivote = i;
                break;
            }
        }

        int num1 = pivote + 1;
        int num2 = pivote;
        while (num2 != num1) {
            int sum = list.get(num1) + list.get(num2);
            if (target == sum) {
                System.out.println(list.get(num1) + "+" + list.get(num2) + "=" + target);
                return true;
            } else if (target < sum) {
                num2--;
                if (num2 == 0) {
                    num2 = list.size() - 1;
                }
            } else {
                num1++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(20);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println("Pivot index: " + isTargetFound(list, target));
    }
}