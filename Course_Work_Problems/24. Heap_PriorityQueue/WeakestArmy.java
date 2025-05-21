import java.util.*;

public class WeakestArmy {
    static class Rank implements Comparable<Rank> {
        int army;
        int index;

        Rank(int army, int index) {
            this.army = army;
            this.index = index;
        }

        @Override
        public int compareTo(Rank r2) {
            if (this.army == r2.army) {
                return this.index - r2.index;
            } else {
                return this.army - r2.army;
            }
        }
    }

    public static void weakestFirst(int[][] army, int k) {
        PriorityQueue<Rank> pq = new PriorityQueue<>();

        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                if (army[i][j] == 1) {
                    count++;
                }
            }
            pq.add(new Rank(count, i));
        }

        while (k-- != 0) {
            System.out.println("Army " + pq.remove().index);
        }
    }

    public static void main(String[] args) {
        int[][] army = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        int k = 2;

        weakestFirst(army, k);
    }
}
