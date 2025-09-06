import java.util.HashMap;
import java.util.Arrays;

public class Que_UniquePrefixUsingMap { // IMP Que asked by google and microsoft
    public static String[] prefix(String[] arr) { // using hash map
        HashMap<Character, Integer> map = new HashMap<>();
        for (String word : arr) {
            for (char ch : word.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        String[] ans = new String[arr.length];
        int sbIdx = 0;
        for (String word : arr) {
            StringBuilder sb = new StringBuilder();
            for (char ch : word.toCharArray()) {
                if (map.get(ch) == 1) {
                    sb.append(ch); // for next 1 char which makes whole chars unique
                    break;
                }
                sb.append(ch); // prefix
            }
            ans[sbIdx++] = sb.toString();
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] arr = { "zebra", "dog", "duck", "dove" };

        String[] ans = prefix(arr);

        System.out.println(Arrays.toString(ans));
    }
}
