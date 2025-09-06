import java.util.TreeMap;

public class TreeHashMap_ {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>(); // store in sorting order
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("Nepal", 6);
        tm.put("US", 50);

        System.out.println(tm);
    }
}
