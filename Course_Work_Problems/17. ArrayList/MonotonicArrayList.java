import java.util.ArrayList;

public class MonotonicArrayList {
    public static boolean isMonotonic(ArrayList<Integer> list) {
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(0) < list.get(i) && list.get(i) > list.get(list.size() - 1)) {
                return false;
            } else if (list.get(0) > list.get(i) && list.get(i) < list.get(list.size() - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(2);

        System.out.println(isMonotonic(list));
    }
}