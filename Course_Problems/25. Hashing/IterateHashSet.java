import java.util.HashSet;

public class IterateHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Mumbai");
        set.add("Pune");
        set.add("Noida");
        set.add("Jaipur");

        // Iterator it = set.iterator(); // way 1
        // while(it.hasNext()) {
        // System.out.println(it.next());
        // }

        for (String city : set) { // way 2
            System.out.println(city);
        }
    }
}
