// Que- Count Distinct(Unique) Elements.

import java.util.HashSet;

public class Q_countUniqueNum {
    public static void countUnique(int[] num) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : num) {
            set.add(n);
        }

        for (Integer n : set) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int[] num = { 1, 3, 5, 1, 3, 2, 5, 4, 1, 7, 8, 4 };
        countUnique(num);
    }
}
