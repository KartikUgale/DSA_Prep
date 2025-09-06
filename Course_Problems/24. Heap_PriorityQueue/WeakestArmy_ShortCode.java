import java.util.*;

public class WeakestArmy_ShortCode {
    public static void weakestFirst(int[][] army, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int countA = Arrays.stream(army[a]).sum();
            int countB = Arrays.stream(army[b]).sum();
            return countA != countB ? countA - countB : a - b;
        });

        for (int i = 0; i < army.length; i++) {
            pq.add(i);
        }

        while (k-- > 0) {
            System.out.println("Army " + pq.remove());
        }
    }

    public static void main(String[] args) {
        int[][] army = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        int k = 2;

        weakestFirst(army, k);
    }
}
