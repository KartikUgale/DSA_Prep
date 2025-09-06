import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashingSetTypes {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>(); // Unorder (random order)
        hs.add("Pune");
        hs.add("Mumbai");
        hs.add("Noida");
        hs.add("asam");
        System.out.println(hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>(); // input or given order
        lhs.add("Pune");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("asam");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>(); // sorted order
        ts.add("Pune");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("asam");
        System.out.println(ts);
    }
}
