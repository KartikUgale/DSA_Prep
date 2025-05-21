// Que- Given are N ropes of different lengths, the task is to connect 
//      these ropes into one rope with minimum cost, such that the cost
//      to connect two ropes is equal to the sum of their lengths.
//          ropes = 2,3,3,4,6        ans = 41
//          ropes = 4,3,2,6          ans = 29

import java.util.*;

public class connectMinRopes {
    public static int calCost(int[] ropes) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;
        while (pq.size() > 1) {
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost += min1 + min2;
            pq.add(min1 + min2);
        }
        return cost;
    }

    public static void main(String[] args) {
        int[] ropes = { 2, 3, 3, 4, 6 };

        System.out.println("Min cost = " + calCost(ropes));
    }
}
