import java.util.LinkedHashMap;

public class LinkedHashMap_ { // 2nd type of Map in Hashing data structure
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("US", 50);
        lhm.put("Nepal", 6);
        lhm.put("China", 150);

        System.out.println(lhm);

    }
}
