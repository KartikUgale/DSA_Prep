import java.util.HashSet;

public class Q_Union_Intersection {
    public static void union_Interct(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        // Union
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        System.out.println("Union = " + set);

        // Intersection
        set.clear();
        for (int num : arr1) {
            set.add(num);
        }

        HashSet<Integer> hs = new HashSet<>();
        for (int num : arr2) {
            if (set.contains(num)) {
                hs.add(num);
            }
        }
        System.out.print("Intersection = " + hs);

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 4, 2, 3, 8 };
        int[] arr2 = { 1, 8, 6, 9 };

        union_Interct(arr1, arr2);
    }
}
