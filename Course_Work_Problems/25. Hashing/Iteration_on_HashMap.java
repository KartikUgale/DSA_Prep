import java.util.HashMap;
import java.util.Set;

public class Iteration_on_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("US", 60);
        hm.put("Japan", 20);
        hm.put("Nepal", 6);

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Contry = " + k + ", Population = " + hm.get(k));
            ;
        }

    }
}
