import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(4);
        list.add(6);
        list.add(2);

        Collections.sort(list); // ascending orfer sort
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // descending order
        System.out.println(list);
    }
}
