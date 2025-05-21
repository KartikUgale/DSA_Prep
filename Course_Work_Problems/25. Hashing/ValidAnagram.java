import java.util.TreeMap;

public class ValidAnagram {
    public static boolean anagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        TreeMap<Character, Integer> tm = new TreeMap<>();

        for (char ch : s.toCharArray()) {
            tm.put(ch, tm.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            if (!tm.containsKey(ch)) {
                return false;
            }
            tm.put(ch, tm.get(ch) - 1);
            if (tm.get(ch) == 0) {
                tm.remove(ch);
            }
        }

        return tm.isEmpty();
    }

    public static void main(String[] args) {
        String s = "race";
        String t = "care";

        System.out.println(anagram(s, t));
    }
}
