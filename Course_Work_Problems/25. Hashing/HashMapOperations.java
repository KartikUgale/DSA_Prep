import java.util.HashMap;
import java.util.Map;

public class HashMapOperations {
    public static void main(String[] args) {
        // creat HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        // (add) variable.put(key, value);
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 60);
        System.out.println(hm);

        for (String n : hm.keySet()) {
            System.out.println("key............. = " + n + ", val = " + hm.get(n));
        }

        for (Map.Entry<String, Integer> e : hm.entrySet()) { // iterate way 2
            String key = e.getKey();
            int val = e.getValue();

            System.out.println("key = " + key + ", value = " + val);
        }

        // (get) variable.get(key);
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Pakistan")); // will return null because Pakistan is not store in hashMap

        // (containsKey) --> true/false
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Pakistan"));

        // (remove) variable.remove(key);
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // size()
        System.out.println("size = " + hm.size());

        // keySet()
        System.out.println(hm.keySet());

        // isEmpty()
        System.out.println(hm.isEmpty());

        // clear
        hm.clear();
        System.out.println("size = " + hm.size());

    }
}