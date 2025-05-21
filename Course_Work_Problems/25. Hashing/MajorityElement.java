import java.util.HashMap;

public class MajorityElement {
    public static void majorElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // if(map.containsKey(key)){
            // map.put(key, map.get(key)+1);
            // } else {
            // map.put(key , 1);
            // }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length / 3) {
                System.out.print(key + " ");
            }
        }

        System.out.println(map.keySet());
    }

    public static void main(String[] args) {
        int[] num = { 1, 3, 2, 5, 1, 3, 1, 5, 3, 1, 3 };
        majorElement(num);
    }
}
