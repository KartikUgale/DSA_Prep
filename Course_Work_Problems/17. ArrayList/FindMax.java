import java.util.ArrayList;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(10);
        list.add(5);

        int max = Integer.MIN_VALUE; // -infinity

        // for (int i : list) {
        //   max = Math.max(max,i);
        // }

        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }

        System.out.println("Max value is = " + max);
    }
}