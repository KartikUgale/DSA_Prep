import java.util.LinkedHashSet;

public class LinkedHashSet_ {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(); // in input or given order

        lhs.add(299);
        lhs.add(943);
        lhs.add(45);

        System.out.println(lhs);

        lhs.remove(943);
        System.out.println(lhs);
    }
}
