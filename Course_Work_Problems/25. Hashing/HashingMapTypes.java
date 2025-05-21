import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashingMapTypes { // All 3 types of Hashing Map data type
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>(); // store in random order
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Nepal", 6);
        hm.put("US", 50);
        System.out.println(hm);

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>(); // store in input order
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("Nepal", 6);
        lhm.put("US", 50);
        System.out.println(lhm);

        TreeMap<String, Integer> tm = new TreeMap<>(); // store in sorting key order
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("Nepal", 6);
        tm.put("US", 50);
        System.out.println(tm);
    }
}
