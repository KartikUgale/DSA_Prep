import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(); // store in sorted array

        ts.add("Pune");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("asam");

        System.out.println(ts);

        TreeSet<Integer> tset = new TreeSet<>();

        tset.add(34);
        tset.add(78);
        tset.add(73);
        tset.add(73); // duplicate will not store
        tset.add(10);

        System.out.println(tset);
    }
}
