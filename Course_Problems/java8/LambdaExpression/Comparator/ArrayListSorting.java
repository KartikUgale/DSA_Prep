import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(12);
        list.add(3);
        list.add(2);
        list.add(5);

        System.out.println("No sorted : " + list);

        // sort list in Ascending way
        Collections.sort(list);
        System.out.println("Ascending order : " + list);

        // sort list in Descending way
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order : " + list);

        // sort list in Descending way using custom comparator (specially for Objects sorting) [Lambda Expression]
        Collections.sort(list, (a,b) -> b - a);     // a - b for Ascending order and b - a for Descending order
        System.out.println("Descending order : " + list);

    }
}
