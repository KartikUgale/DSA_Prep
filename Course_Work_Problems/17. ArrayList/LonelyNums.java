import java.util.Collections;
import java.util.ArrayList;

public class LonelyNums { // Not Completed
    public static void lonely(ArrayList<Integer> list) {
        Collections.sort(list);
        ArrayList<Integer> lonely = new ArrayList<>();

        if (list.size() >= 2) {
            if (list.get(0) + 1 > list.get(1)) {
                lonely.add(list.get(0));
            }
        }

        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i - 1) + 1 && list.get(i) + 1 > list.get(i + 1)) {
                lonely.add(list.get(i));
            }
        }
        if (list.size() < 2) {
            lonely.add(list.get(0));
        }

        System.out.println(lonely);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);

        lonely(list);
    }
}
